package com.xi.grpcserver.service;

import com.xi.demo.grpc.lib.HospitalType;
import com.xi.demo.grpc.lib.PatientType;
import com.xi.grpclib.StatusCode;
import com.xi.grpcserver.entity.Hospital;
import com.xi.grpcserver.entity.Patient;
import io.vavr.Tuple2;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * The service containing business logic.
 */
public interface DemoService {
    /**
     * Create a hospital.
     *
     * @param hospital hospital entity without id
     * @return created hospital with generated id
     */
    public Hospital createHospital(Hospital hospital);

    /**
     * Update the hospital.
     *
     * @param hospitalUpdate the new hospital entity
     * @return updated hospital
     */
    public Optional<Hospital> updateHospital(HospitalType hospitalUpdate);

    /**
     * Delete the hospital.
     *
     * @param id the hospital id to delete
     */
    public void deleteHospital(long id);

    /**
     * Get the hospital with all registered patients.
     *
     * @param id the hospital id
     * @return the hospital entity
     */
    public Optional<Hospital> getHospital(long id);

    /**
     * Create a patient.
     *
     * @param patient patient entity without id
     * @return created patient with generated id
     */
    public Patient createPatient(Patient patient);

    /**
     * Update the patient.
     *
     * @param patientUpdate the new patient entity
     * @return updated patient
     */
    public Optional<Patient> updatePatient(PatientType patientUpdate);

    /**
     * Delete the patient.
     *
     * @param id the patient id to delete
     */
    public void deletePatient(long id);

    /**
     * Get the patient with all registered hospitals.
     *
     * @param id the patient id
     * @return the patient entity
     */
    public Optional<Patient> getPatient(long id);

    /**
     * Register the patient in the hospital.
     *
     * @param patientId  the patient id
     * @param hospitalId the hospital id
     * @return whether success or not
     */
    public boolean registerPatient(long patientId, long hospitalId);

    /**
     * Unregister the patient in the hospital.
     *
     * @param patientId  the patient id
     * @param hospitalId the hospital id
     * @return whether success or not
     */
    public boolean unregisterPatient(long patientId, long hospitalId);
}
