package com.medicare.service;

import java.util.List;

import com.medicare.model.Payment;

public interface PaymentService {

	List<Payment> getAllPayment();
	
	Payment dopayment(Payment payment);

}
