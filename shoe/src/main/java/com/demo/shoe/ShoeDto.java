package com.demo.shoe;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoes_info")
public class ShoeDto {

	@Id
	private int id;
	private String brand;
	private int length;
	private int price;
	
	public ShoeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoeDto(int id, String brand, int length, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.length = length;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoeDto [id=" + id + ", brand=" + brand + ", length=" + length + ", price=" + price + "]";
	}
	
}
