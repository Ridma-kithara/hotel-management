package com.example.mspayment.payment.repository;

import com.example.mspayment.payment.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
