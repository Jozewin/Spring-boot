package com.medical.blockchain.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class AccessRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private User provider;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;
    
    private String requestHash;
    private LocalDateTime requestedAt;
    private LocalDateTime approvedAt;
    private String status; // PENDING, APPROVED, REJECTED
} 