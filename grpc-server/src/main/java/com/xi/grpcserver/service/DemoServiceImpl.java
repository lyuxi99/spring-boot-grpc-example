package com.xi.grpcserver.service;

import com.xi.demo.grpc.lib.HospitalType;
import com.xi.demo.grpc.lib.PatientType;
import com.xi.grpcserver.entity.Hospital;
import com.xi.grpcserver.entity.Patient;
import com.xi.grpcserver.repository.HospitalRepository;
import com.xi.grpcserver.repository.PatientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Hospital createHospital(Hospital hospital) {
        return hospitalRepository.saveAndFlush(hospital);
    }


    @Override
    public Optional<Hospital> updateHospital(HospitalType hospitalUpdate) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalUpdate.getId());
        if (optionalHospital.isEmpty()) {
            return Optional.empty();
        }
        Hospital hospital = optionalHospital.get();
        BeanUtils.copyProperties(hospitalUpdate, hospital);
        hospitalRepository.saveAndFlush(hospital);
        return Optional.of(hospital);
    }

    @Override
    public void deleteHospital(long id) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(id);
        optionalHospital.ifPresent(hospital -> hospitalRepository.delete(hospital));
        patientRepository.flush();
    }

    @Override
    public Optional<Hospital> getHospital(long id) {
        return hospitalRepository.findById(id);
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.saveAndFlush(patient);
    }

    @Override
    public Optional<Patient> updatePatient(PatientType patientUpdate) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientUpdate.getId());
        if (optionalPatient.isEmpty()) {
            return Optional.empty();
        }
        Patient patient = optionalPatient.get();
        BeanUtils.copyProperties(patientUpdate, patient);
        patientRepository.saveAndFlush(patient);
        return Optional.of(patient);
    }

    @Override
    public void deletePatient(long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        optionalPatient.ifPresent(patient -> patientRepository.delete(patient));
        patientRepository.flush();
    }

    @Override
    public Optional<Patient> getPatient(long id) {
        return patientRepository.findById(id);
    }

    @Override
    public boolean registerPatient(long patientId, long hospitalId) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalId);
        if (optionalHospital.isEmpty()) {
            return false;
        }
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isEmpty()) {
            return false;
        }
        Hospital hospital = optionalHospital.get();
        hospital.getPatients().add(optionalPatient.get());
        return true;
    }

    @Override
    public boolean unregisterPatient(long patientId, long hospitalId) {
        Optional<Hospital> optionalHospital = hospitalRepository.findById(hospitalId);
        if (optionalHospital.isEmpty()) {
            return false;
        }
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isEmpty()) {
            return false;
        }
        Hospital hospital = optionalHospital.get();
        hospital.getPatients().remove(optionalPatient.get());
        return true;
    }
}
