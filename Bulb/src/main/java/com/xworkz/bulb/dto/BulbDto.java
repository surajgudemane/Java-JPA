package com.xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "bulb_info")
@NamedQuery(name = "readAll", query = "Select read from BulbDto read")
@NamedQuery(name="findByName",query="select find from BulbDto find where find.name=:name")
@NamedQuery(name = "findByType",query = "Select find from BulbDto find where find.type=:type")

public class BulbDto {

	@Id
	private int id;
	private String name;
	private String type;
	private String capacity;
	private int price;
	
	public BulbDto() {
		super();
	}

	public BulbDto(int id, String name, String type, String capacity, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BulbDto [id=" + id + ", name=" + name + ", type=" + type + ", capacity=" + capacity + ", price=" + price
				+ "]";
	}
	
	
}
