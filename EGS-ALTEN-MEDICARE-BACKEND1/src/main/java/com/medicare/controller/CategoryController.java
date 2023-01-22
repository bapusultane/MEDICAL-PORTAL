package com.medicare.controller;

import java.util.List;

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

import com.medicare.model.Category;

import com.medicare.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/category/")
public class CategoryController {

	@Autowired 
	CategoryService  categoryService;

	@PostMapping("/add")
	public ResponseEntity<Category> addcategory(@RequestBody Category category){

		System.out.println("welcome to category controller ");
		return ResponseEntity.ok(categoryService.save(category));
	}
	@PutMapping("/update")  
	private Category updatecategory(@RequestBody Category category)   
	{  
		categoryService.save(category);
		return category;  
	}  

	@GetMapping("/categorylist")  
	private List<Category> getAllCategory()   

	{  
		return categoryService.getAllCategory();  
	}  
	@DeleteMapping("/category/{catid}")  
	private void deleteCategory(@PathVariable("catid") Integer catid)   
	{  
		categoryService.delete(catid); 
	}  




}
