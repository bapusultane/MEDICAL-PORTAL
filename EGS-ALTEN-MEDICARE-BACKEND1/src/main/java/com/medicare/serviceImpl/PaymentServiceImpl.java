package com.medicare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Payment;
import com.medicare.respository.PaymentRepository;
import com.medicare.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService {

	
	@Autowired 
	PaymentRepository  paymentRepository;
	
	@Override
	public List<Payment> getAllPayment() {
		
		return paymentRepository.findAll();
	}

	@Override
	public Payment dopayment(Payment payment) {
		
		return paymentRepository.save(payment);
	}
	

}
