package com.xi.grpcserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xi.demo.grpc.lib.CreatePatientReq;
import com.xi.demo.grpc.lib.PatientType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "patient")
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String healthInsuranceNumber;

    private String phone;

    private String email;

    private String address;

    @JsonIgnore
    @ManyToMany(mappedBy = "patients")
    private Set<Hospital> hospitals;


    public PatientType toGrpcType() {
        return PatientType.newBuilder().setId(id).setName(name).setHealthInsuranceNumber(healthInsuranceNumber)
                .setEmail(email).setPhone(phone).setAddress(address).build();
    }

    public static Patient fromGrpcType(PatientType patientMsg) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientMsg, patient);
        return patient;
    }

    public static Patient fromGrpcType(CreatePatientReq createPatientReq) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(createPatientReq, patient);
        return patient;
    }

    @PreRemove
    private void removePatientFromHospitals() {
        for (Hospital u : hospitals) {
            u.getPatients().remove(this);
        }
    }
}
