package com.jpa.cooldrink.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "cooldrink_info")
@NamedQuery(name = "readAll", query = "select read from CoolDrinkDto read")
@NamedQuery(name = "readByTaste", query = "Select read from CoolDrinkDto read where read.taste =: taste")
@NamedQuery(name = "readById", query = "SeleCt read fRom CoolDrinkDto read where read.id =: id")
@NamedQuery(name = "update", query = "update CoolDrinkDto u set u.taste =: taste where u.id =: id")
@NamedQuery(name = "delete", query = "Delete from CoolDrinkDto d where d.price =: price")
public class CoolDrinkDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String ml;
	private String taste;
	private int price;
	
	public CoolDrinkDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CoolDrinkDto(String name, String ml, String taste, int price) {
		super();
		this.name = name;
		this.ml = ml;
		this.taste = taste;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMl() {
		return ml;
	}

	public void setMl(String ml) {
		this.ml = ml;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CoolDrinkDto [id=" + id + ", name=" + name + ", ml=" + ml + ", taste=" + taste + ", price=" + price
				+ "]";
	}
	
}
