package com.silsub2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
	}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String info() {
		return pName + ", " + price + ", " + brand;
	}
}
