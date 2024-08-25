package com.api.product.Icontroller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.product.POJO.Product;

@RequestMapping(path = "/product")
@CrossOrigin(origins = "*")
public interface ProductController {

	@PostMapping(path = "/addNewProduct")
	public ResponseEntity<String> addNewProduct(@RequestBody(required = true) Map<String, String> requestMap);

	@GetMapping(path = "/getAllProduct")
	public ResponseEntity<List<Product>> getAllProduct();

	@PutMapping(path = "/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody(required = true) Map<String, String> requestMap);

	@DeleteMapping(path = "/deleteProduct/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId);
}
