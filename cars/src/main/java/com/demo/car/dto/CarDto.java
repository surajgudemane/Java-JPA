package com.demo.car.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "car_info")
@NamedQuery(name = "readAll", query="Select read from CarDto read")
@NamedQuery(name = "findByBrand", query = "Select find from CarDto find where find.brand =: brand")
@NamedQuery(name = "updateSeatByType", query = "Update CarDto dto set dto.noSeats =: noSeats where dto.type =: type")
@NamedQuery(name = "deleteByType", query = "Delete from CarDto dto where dto.type =: type")
public class CarDto {

	@Id
	private int id;
	private String brand;
	private String name;
	private String type;
	private int noSeats;
	
	public CarDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarDto(int id, String brand, String name, String type, int noSeats) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.noSeats = noSeats;
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

	public int getNoSeats() {
		return noSeats;
	}

	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}

	@Override
	public String toString() {
		return "CarDto [id=" + id + ", brand=" + brand + ", name=" + name + ", type=" + type + ", noSeats=" + noSeats
				+ "]";
	}

}
