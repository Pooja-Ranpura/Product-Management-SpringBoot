package com.example.demo;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.Data;

import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Data

@Component
@Entity
public class Product {
	
	@Id
	private int id;
	
	private String name;
	
	private long price;
	private int quentity;
	
	public Product() {
		
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public long getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getquentity() {
		return quentity;
	}

	public void setquentity(int quentity) {
		this.quentity = quentity;
	}
	
	

	public Product(int id, String name, long price, int quentity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quentity = quentity;
	}
	
	
}

