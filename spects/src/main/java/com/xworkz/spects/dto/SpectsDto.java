package com.xworkz.spects.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "spects_info")
@NamedQuery(name= "readAll", query ="Select read from SpectsDto read")
@NamedQuery(name="findByShapeAndPrice", query="Select find from SpectsDto find where find.type=:type and find.price=:price" )
@NamedQuery(name="UpdatepriceByName",query="Update SpectsDto dto set dto.price=:price where dto.name=:name")
@NamedQuery(name="UpdateColorByPriceAndShape", query="Update SpectsDto dto set dto.color=:color where dto.price=:price and dto.type=:shape")
@NamedQuery(name="deletePriceAndColor", query="Delete from SpectsDto dto where dto.price=:price and dto.color=:color")
@NamedQuery(name="deleteNameAndId", query="Delete from SpectsDto dto where dto.name=:name and dto.id=:id")
public class SpectsDto {

	@Id
	private int id;
	private String name;
	private String type;
	private String color;
	private int price;
	
	public SpectsDto() {
		super();
	}

	public SpectsDto(int id, String name, String type, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SpectsDto [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", price=" + price
				+ "]";
	} 
	
	
}
