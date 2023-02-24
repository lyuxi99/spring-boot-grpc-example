package com.xi.grpcserver.repository;

import com.xi.grpcserver.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository of patient beans.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
