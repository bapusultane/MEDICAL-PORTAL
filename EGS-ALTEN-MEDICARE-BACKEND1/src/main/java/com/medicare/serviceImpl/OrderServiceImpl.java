package com.medicare.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Orders;
import com.medicare.respository.OrderRepository;
import com.medicare.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired 
	OrderRepository ordersRepository;

	
	
	@Override
	public Orders addOrder(Orders orders) {
		return ordersRepository.save(orders);
	}
	
	@Override
	public List<Orders> getAllOrders() {
		
		 return ordersRepository.findAll();
	}

	@Override
	public Orders getById(Integer id) {
		
		return  ordersRepository.getById(id);
	}

	

	
}
