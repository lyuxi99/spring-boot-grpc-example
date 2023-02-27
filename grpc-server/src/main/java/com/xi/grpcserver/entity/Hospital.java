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
     * Hospital ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Hospital name
     */
    private String name;

    /**
     * Address
     */
    private String address;

    /**
     * Phone number
     */
    private String phone;

    /**
     * Email address
     */
    private String email;

    /**
     * Hospital beds
     */
    private long beds;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "hospital_patient", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients;

    public HospitalType toGrpcType() {
        return HospitalType.newBuilder().setId(id).setName(name).setEmail(email).setPhone(phone)
                .setAddress(address).setBeds(beds).build();
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
