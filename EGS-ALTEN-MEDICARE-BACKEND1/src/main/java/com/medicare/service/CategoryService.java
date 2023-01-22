package com.medicare.service;

import java.util.List;

import com.medicare.model.Category;
import com.medicare.model.Product;



public interface CategoryService {

	Category save(Category category);

	void udpateCategory(Category category);

	List <Category> getAllCategory();

	void delete(Integer catid);

}
