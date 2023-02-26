package com.xi.grpcserver.service;

import com.xi.demo.grpc.lib.HospitalType;
import com.xi.demo.grpc.lib.PatientType;
import com.xi.grpcserver.entity.Hospital;
import com.xi.grpcserver.entity.Patient;

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
    Hospital createHospital(Hospital hospital);

    /**
     * Update the hospital.
     *
     * @param hospitalUpdate the new hospital entity
     * @return updated hospital
     */
    Optional<Hospital> updateHospital(HospitalType hospitalUpdate);

    /**
     * Delete the hospital.
     *
     * @param id the hospital id to delete
     */
    void deleteHospital(long id);

    /**
     * Get the hospital with all registered patients.
     *
     * @param id the hospital id
     * @return the hospital entity
     */
    Optional<Hospital> getHospital(long id);

    /**
     * Create a patient.
     *
     * @param patient patient entity without id
     * @return created patient with generated id
     */
    Patient createPatient(Patient patient);

    /**
     * Update the patient.
     *
     * @param patientUpdate the new patient entity
     * @return updated patient
     */
    Optional<Patient> updatePatient(PatientType patientUpdate);

    /**
     * Delete the patient.
     *
     * @param id the patient id to delete
     */
    void deletePatient(long id);

    /**
     * Get the patient with all registered hospitals.
     *
     * @param id the patient id
     * @return the patient entity
     */
    Optional<Patient> getPatient(long id);

    /**
     * Register the patient in the hospital.
     *
     * @param patientId  the patient id
     * @param hospitalId the hospital id
     * @return whether success or not
     */
    boolean registerPatient(long patientId, long hospitalId);

    /**
     * Unregister the patient in the hospital.
     *
     * @param patientId  the patient id
     * @param hospitalId the hospital id
     * @return whether success or not
     */
    boolean unregisterPatient(long patientId, long hospitalId);
}
