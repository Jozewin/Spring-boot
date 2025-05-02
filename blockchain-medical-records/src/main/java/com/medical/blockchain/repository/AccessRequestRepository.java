package com.medical.blockchain.repository;

import com.medical.blockchain.model.AccessRequest;
import com.medical.blockchain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccessRequestRepository extends JpaRepository<AccessRequest, Long> {
    List<AccessRequest> findByPatient(User patient);
    List<AccessRequest> findByProvider(User provider);
    List<AccessRequest> findByPatientAndStatus(User patient, String status);
} 