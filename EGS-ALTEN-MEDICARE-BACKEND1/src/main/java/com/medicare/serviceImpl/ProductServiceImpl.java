package com.medicare.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.model.Product;
import com.medicare.model.User;
import com.medicare.respository.ProductRepository;
import com.medicare.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired 
	ProductRepository productRepository;

	//checked-B@apu

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	//checked-B@apu
	@Override
	public List<Product> getAllProduct() {

		return productRepository.findAll();
	}
	//checked-B@apu
	@Override
	public void deleteProduct(Integer pid) {
		productRepository.deleteById(pid);
		
	}
	public void saveOrUpdate(Product Product)   
	{  
		productRepository.save(Product);  
	} 

	












	@Override
	public Product getProductDetailsById(Integer id) {
		return productRepository.getProductDetailsById(id);
	}
	@Override
	public Product getdetailsByProductName(String productname) {
		return productRepository.getdetailsByProductName(productname);
	}
	@Override
	public void updateProductById(Integer pid) {
		Product pro = productRepository.getById(pid);
		//pro.setProductName("Coragen");
		productRepository.save(pro);
	}
	//
	//	@Override
	//	public void deleteProductById(Integer id) {
	//		productRepository.deleteById(Long.parseLong(id.toString()));
	//
	//	}

	@Override
	public List<Product> list() {
		return productRepository.findAll();
	}
	@Override
	public Product getproductDetailsBypriceAsc(Integer price) {
		return productRepository.getproductDetailsBypriceAsc(price);
		//list implemt karaychi ki nahin 
	}

	@Override
	public Product getproductDetailsBypriceDsc(Integer price) {
		return productRepository.getproductDetailsBypriceDsc(price);
	}

	@Override
	public Product getProcuctDetailsByPrice(Integer price) {
		return productRepository.getProductDetailsByPrice(price);
	}
	@Override
	public Product save(Product product) {

		return productRepository.save(product);
	}
	

	//getting all Product record by using the method findaAll() of CrudRepository  
	public List<Product> getAllProducts()   
	{  
		List<Product> Product = new ArrayList<Product>();  
		productRepository.findAll().forEach(Product1 -> Product.add(Product1));  
		return Product;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Product getProductById(Integer pid)   
	{  
		return productRepository.findById(pid).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	 
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(Integer pid)   
	{  
		productRepository.deleteById(pid);  
	}  
	//updating a record  
	public void update(Product Product, Integer pid)   
	{  
		productRepository.save(Product);  
	}
	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return null;
//	}
//	@Override
//	public void delete(int pid) {
//		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProductById(Integer id) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public void deleteProd(Integer name) {
//		productRepository.delete(name);
//	}

	
}