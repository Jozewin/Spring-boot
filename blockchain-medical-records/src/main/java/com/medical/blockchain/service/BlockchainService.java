package com.medical.blockchain.service;

import com.medical.blockchain.model.MedicalRecord;
import com.medical.blockchain.model.AccessRequest;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import java.util.concurrent.CompletableFuture;

public interface BlockchainService {
    CompletableFuture<TransactionReceipt> addMedicalRecord(MedicalRecord record);
    CompletableFuture<TransactionReceipt> requestAccess(AccessRequest request);
    CompletableFuture<TransactionReceipt> grantAccess(AccessRequest request);
    CompletableFuture<TransactionReceipt> revokeAccess(AccessRequest request);
    String getRecordData(String recordHash);
} 