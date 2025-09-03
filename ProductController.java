package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import java.util.*;

@RestController

public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
    public List<Product> getStudent() {
    	return service.getProducts();
    }
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductId(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		System.out.println(prod);
		service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		
		System.out.println("updated");
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void updateProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
	
	
	
}
