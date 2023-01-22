package com.medicare.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medicare.model.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository <Product, Integer>  {
	@Query(value = "SELECT * FROM Product WHERE productname=:productname", nativeQuery = true)
	public Product getdetailsByProductName(@Param("productname") String productname);

	@Query(value = "SELECT * FROM Product WHERE id=:id", nativeQuery = true)
	public Product getProductDetailsById(@Param("id") Integer id);

	@Query(value = "SELECT *FROM Product WHERE price=:price", nativeQuery = true)
	public Product getProductDetailsByPrice(@Param("price") Integer price);

	@Query(value = "SELECT *FROM Product WHERE price=:price ORDER BY price ASC", nativeQuery = true)
	public Product getproductDetailsBypriceAsc(@Param("price") Integer price);

	@Query(value = "SELECT *FROM Product WHERE price=:price ORDER BY price DSC", nativeQuery = true)
	public Product getproductDetailsBypriceDsc(@Param("price")Integer price);

	
}
