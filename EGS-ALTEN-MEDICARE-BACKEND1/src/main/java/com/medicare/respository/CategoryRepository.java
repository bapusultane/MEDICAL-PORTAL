package com.medicare.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.model.Category;

public interface CategoryRepository  extends JpaRepository <Category , Integer>{

	
}
