package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
    @Autowired
	ProductRepo repo;
    
   
    
    public List<Product> getProducts(){
    	return repo.findAll();
    	
    }
    
    public Product getProductId(int prodId) {
    	return repo.findById(prodId).orElse(null);
    }
    
    public void addProduct(Product prod) {
    	repo.save(prod);
    }
    
    public void updateProduct(Product prod) {
    	repo.save(prod);
    }
    
    public void deleteProduct(int prodId) {
    	repo.deleteById(prodId);
    }
}
