package com.project.airlines.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "airlines_info")
public class AirlinesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	public AirlinesEntity() {
		super();
	}
	
	public AirlinesEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "AirlinesEntity [id=" + id + ", name=" + name + "]";
	}

}
