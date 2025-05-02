package com.medical.blockchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@SpringBootApplication
public class BlockchainMedicalRecordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainMedicalRecordsApplication.class, args);
    }

    @Bean
    public Web3j web3j() {
        return Web3j.build(new HttpService("http://localhost:8545")); // Replace with your Ethereum node URL
    }
} 