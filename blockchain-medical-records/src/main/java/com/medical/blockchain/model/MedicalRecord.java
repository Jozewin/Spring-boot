package com.medical.blockchain.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String recordHash;
    private String encryptedData;
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;
    
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private User provider;
    
    private String ipfsHash;
    private boolean isActive;
} 