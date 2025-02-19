package com.example.mspayment.payment.service;

import com.example.mspayment.payment.entity.Payment;
import com.example.mspayment.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id ) {
        paymentRepository.deleteById(id);
    }
}
