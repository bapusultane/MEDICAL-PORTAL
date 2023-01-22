package com.medicare.service;

import java.util.List;

import com.medicare.model.Product;
import com.medicare.model.User;


public interface ProductService {
	Product getdetailsByProductName(String productname);//after by is return type
	Product getProductDetailsById(Integer id);
	void updateProductById(Integer id);
	void deleteProductById(Integer id);
	List<Product> list();
	Product getProcuctDetailsByPrice(Integer price);
	Product getproductDetailsBypriceAsc(Integer price);
	Product getproductDetailsBypriceDsc(Integer price);
	Product save(Product product);
	
	User getUserById(long id);
	Product createProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(int pid);

	void delete(Integer pid);

	void saveOrUpdate(Product product);
	
	List<Product> getAllProducts();
	
	Product addProduct(Product product);
	void deleteProduct(Integer pid );
}
