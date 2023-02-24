package com.xi.grpcserver.repository;

import com.xi.grpcserver.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository of hospital beans.
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
