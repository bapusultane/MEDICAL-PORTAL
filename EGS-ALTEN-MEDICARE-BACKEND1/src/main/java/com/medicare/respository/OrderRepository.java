package com.medicare.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medicare.model.Orders;

public interface OrderRepository extends JpaRepository <Orders, Integer>{

	@Query(value = "SELECT * FROM Orders WHERE id=:id", nativeQuery = true)
	Orders getById(Integer id);

}
