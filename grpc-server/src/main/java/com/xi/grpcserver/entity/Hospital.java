package com.xi.grpcserver.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xi.demo.grpc.lib.CreateHospitalReq;
import com.xi.demo.grpc.lib.HospitalType;
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
@Table(name = "hospital")
@AllArgsConstructor
@NoArgsConstructor
public class Hospital implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String address;

    private String phone;

    private String email;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "hospital_patient", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients;

    public HospitalType toGrpcType() {
        return HospitalType.newBuilder().setId(id).setName(name).setEmail(email).setPhone(phone).setAddress(address).build();
    }

    public static Hospital fromGrpcType(HospitalType hospitalMsg) {
        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(hospitalMsg, hospital);
        return hospital;
    }

    public static Hospital fromGrpcType(CreateHospitalReq createHospitalReq) {
        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(createHospitalReq, hospital);
        return hospital;
    }

    @PreRemove
    private void removeHospitalFromPatients() {
        for (Patient u : patients) {
            u.getHospitals().remove(this);
        }
    }
}
