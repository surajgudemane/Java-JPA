package com.demo.fridge.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "fridge_info")
@NamedQuery(name = "readAll", query = "Select dto from FridgeDto dto")
@NamedQuery(name = "find", query = "Select dto from FridgeDto dto where dto.brand =: brand")
@NamedQuery(name = "update", query = "Update FridgeDto dto set dto.capacity =: capacity where dto.door =: door")
@NamedQuery(name = "delete", query = "Delete from FridgeDto dto where dto.price =: price")
public class FridgeDto {

	@Id
	private int id;
	private String brand;
	private int capacity;
	private int door;
	private int price;
	
	public FridgeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FridgeDto(int id, String brand, int capacity, int door, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.door = door;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FridgeDto id = " + id + ", brand = " + brand + ", capacity = " + capacity + ", door = " + door + ", price = "+ price + "\n";
	}
}
