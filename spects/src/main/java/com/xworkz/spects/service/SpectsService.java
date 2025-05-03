package com.xworkz.spects.service;

import java.util.List;

import com.xworkz.spects.dto.SpectsDto;

public interface SpectsService {
	
	public boolean SaveAll(List<SpectsDto> dto);
	
	public List<SpectsDto> readAll();
	
	public SpectsDto findById(int id);
	
	public SpectsDto findByShapeAndPrice(String shape, int price);
	
	public boolean updatePriceByName(int price, String name);
	
	public boolean UpdateColorByPriceAndShape(String color, int price, String shape);
	
	public boolean deleteByPriceAndColor(int price, String color);
	
	public boolean deleteNameAndId(String name, int id);

}
