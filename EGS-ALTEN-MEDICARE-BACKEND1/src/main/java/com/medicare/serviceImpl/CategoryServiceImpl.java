package com.medicare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Category;
import com.medicare.model.Product;
import com.medicare.respository.CategoryRepository;
import com.medicare.service.CategoryService;
@Service
public class CategoryServiceImpl  implements CategoryService{
	
	@Autowired 
	CategoryRepository categoryRepository;

	@Override
	public Category save(Category category) {
		
		return categoryRepository.save(category);
	}

	@Override
	public void udpateCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}

	@Override
	public void delete(Integer catid) {
		
		categoryRepository.deleteById(catid);
		
	}


	


}
