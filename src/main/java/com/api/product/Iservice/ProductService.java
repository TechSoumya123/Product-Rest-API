package com.api.product.Iservice;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.api.product.POJO.Product;

public interface ProductService {

	public ResponseEntity<String> addNewProduct(Map<String, String> requestMap);

	public ResponseEntity<List<Product>> getAllProduct();

	public ResponseEntity<String> updateProduct(Map<String, String> requestMap);

	public ResponseEntity<String> deleteProduct(int productId);

}
