package com.medicare.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.model.Product;
import com.medicare.service.ProductService;
@RestController
@CrossOrigin(origins = "http://localhost:51486")
@RequestMapping("/api/product/")
public class ProductController {

	@Autowired 
	ProductService productService;

	//checked-B@apu
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){

		System.out.println("welcome to product controller ");
		return ResponseEntity.ok(productService.save(product));
	}
	//checked 
	@GetMapping("/productlist")  
	private List<Product> getAllProduct()   

	{  
		return productService.getAllProduct();  
	}  
	//checked 
	@DeleteMapping("/product/{pid}")  
	private void deleteProduct(@PathVariable("pid") Integer pid)   
	{  
		productService.delete(pid); 
	}  
	//checked
	@PutMapping("/update")  
	private Product update(@RequestBody Product product)   
	{  
		productService.saveOrUpdate(product);  
		return product;  
	}  


}






