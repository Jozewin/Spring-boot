package com.medical.blockchain.repository;

import com.medical.blockchain.model.MedicalRecord;
import com.medical.blockchain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
    List<MedicalRecord> findByPatient(User patient);
    List<MedicalRecord> findByProvider(User provider);
    Optional<MedicalRecord> findByRecordHash(String recordHash);
} 