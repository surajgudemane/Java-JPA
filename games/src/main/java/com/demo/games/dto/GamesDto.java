package com.demo.games.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "games_info")
public class GamesDto {

	@Id
	private int id;
	private String name;
	private String size;
	private String type;
	private int ageRestriction;
	private String isFree;
	
	public GamesDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GamesDto(int id, String name, String size, String type, int ageRestriction, String isFree) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.type = type;
		this.ageRestriction = ageRestriction;
		this.isFree = isFree;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAgeRestriction() {
		return ageRestriction;
	}

	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}

	public String getIsFree() {
		return isFree;
	}

	public void setIsFree(String isFree) {
		this.isFree = isFree;
	}

	@Override
	public String toString() {
		return "GamesDto [id=" + id + ", name=" + name + ", size=" + size + ", type=" + type + ", ageRestriction="
				+ ageRestriction + ", isFree=" + isFree + "]";
	}

}
