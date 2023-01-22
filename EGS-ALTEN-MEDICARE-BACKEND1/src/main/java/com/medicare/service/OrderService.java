package com.medicare.service;

import java.util.List;

import com.medicare.model.Orders;

public interface OrderService {

	List<Orders> getAllOrders();

	Orders addOrder(Orders orders);

	Orders  getById(Integer id);
	

	
	

}
