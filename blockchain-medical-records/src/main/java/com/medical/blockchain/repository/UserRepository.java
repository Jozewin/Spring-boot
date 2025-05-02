package com.medical.blockchain.repository;

import com.medical.blockchain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEthereumAddress(String ethereumAddress);
} 