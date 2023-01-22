package com.medicare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Orders;

import com.medicare.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/orders/")
@RestController 
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/add")
	public ResponseEntity<Orders> addOrder(@RequestBody Orders order){

		System.out.println("welcome to product controller ");
		return ResponseEntity.ok(orderService.addOrder(order));
	}
	@GetMapping("/orderlist")  
	private List<Orders> getAllOrders()   
	{  
		return orderService.getAllOrders();  
	}  

	// get employee by id
	@GetMapping("/orders/{id}")
	public ResponseEntity<Orders> getbyid(@PathVariable Integer id) {
		Orders orders = orderService.getById(id);

		return ResponseEntity.ok(orders);
	}
}

