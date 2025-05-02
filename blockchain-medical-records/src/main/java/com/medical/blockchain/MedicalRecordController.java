package com.medical.blockchain;

import com.medical.blockchain.model.MedicalRecord;
import com.medical.blockchain.model.AccessRequest;
import com.medical.blockchain.service.BlockchainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/medical-records")
public class MedicalRecordController {
    
    @Autowired
    private BlockchainService blockchainService;
    
    @PostMapping
    public CompletableFuture<ResponseEntity<?>> addMedicalRecord(@RequestBody MedicalRecord record) {
        return blockchainService.addMedicalRecord(record)
                .thenApply(receipt -> ResponseEntity.ok().body(receipt));
    }
    
    @PostMapping("/request-access")
    public CompletableFuture<ResponseEntity<?>> requestAccess(@RequestBody AccessRequest request) {
        return blockchainService.requestAccess(request)
                .thenApply(receipt -> ResponseEntity.ok().body(receipt));
    }
    
    @PostMapping("/grant-access")
    public CompletableFuture<ResponseEntity<?>> grantAccess(@RequestBody AccessRequest request) {
        return blockchainService.grantAccess(request)
                .thenApply(receipt -> ResponseEntity.ok().body(receipt));
    }
    
    @PostMapping("/revoke-access")
    public CompletableFuture<ResponseEntity<?>> revokeAccess(@RequestBody AccessRequest request) {
        return blockchainService.revokeAccess(request)
                .thenApply(receipt -> ResponseEntity.ok().body(receipt));
    }
    
    @GetMapping("/{recordHash}")
    public ResponseEntity<String> getRecordData(@PathVariable String recordHash) {
        String data = blockchainService.getRecordData(recordHash);
        return ResponseEntity.ok().body(data);
    }
} 