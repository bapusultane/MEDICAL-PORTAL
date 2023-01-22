package com.medicare.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	List<Payment> findAll();

}
