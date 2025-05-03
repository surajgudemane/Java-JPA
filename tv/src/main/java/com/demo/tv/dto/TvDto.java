package com.demo.tv.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tv_info")
@NamedQuery(name = "readAll", query = "Select read from TvDto read")
@NamedQuery(name = "readById", query = "Select read from TvDto read where read.id =: id")
@NamedQuery(name = "update", query = "Update TvDto up set up.price =: price where up.name =: name")
@NamedQuery(name = "delete", query = "Delete from TvDto de where de.size <: size")
public class TvDto {

	@Id
	private int id;
	private String name;
	private int size;
	private String type;
	private int price;
	public TvDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TvDto(int id, String name, int size, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
		return "TvDto [id=" + id + ", name=" + name + ", size=" + size + ", type=" + type + ", price=" + price + "]";
	}
	
}
