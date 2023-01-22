package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Payment;
import com.medicare.service.PaymentService;


@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/payment/")
@RestController 
public class PaymentController {

	@Autowired 
	 PaymentService paymentService;
	
	@PostMapping("/do")
	public ResponseEntity<Payment> dopayment(@RequestBody Payment payment){

		System.out.println("welcome to product controller ");
		return ResponseEntity.ok(paymentService.dopayment(payment));
	}
	
	@GetMapping("/paymentlist")  
	private List<Payment> getAllPayment()   

	{  
		return paymentService.getAllPayment();  
	}  


}
