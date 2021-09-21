package com.simplilearn.shop;

// import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Product")
public class Product {
	
	
	@Id
	@GeneratedValue
	private int productId;
	
	private String name;
	
	private double price;
	
	
	

	public Product() {
		super();
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	

}
