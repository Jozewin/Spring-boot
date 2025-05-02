package com.medical.blockchain.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String ethereumAddress;
    private String role; // PATIENT or PROVIDER
    
    @OneToMany(mappedBy = "patient")
    private Set<MedicalRecord> medicalRecords;
    
    @OneToMany(mappedBy = "provider")
    private Set<AccessRequest> accessRequests;
} 