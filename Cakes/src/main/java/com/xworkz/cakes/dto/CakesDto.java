package com.xworkz.cakes.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name= "cake_info")
@NamedQuery(name = "readall", query = "Select read from CakesDto read")
@NamedQuery(name = "findByName", query = "Select find from CakesDto find where find.name=:cakeName")
public class CakesDto {

	@Id
	private int id;
	private String name;
	private String flavour;
	private String type;
	private int price;
	
	public CakesDto() {
		super();
	}

	public CakesDto(int id, String name, String flavour, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.flavour = flavour;
		this.type = type;
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

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CakeDto [id=" + id + ", name=" + name + ", flavour=" + flavour + ", type=" + type + ", price=" + price
				+ "]";
	}
}
