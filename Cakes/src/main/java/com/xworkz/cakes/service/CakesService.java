package com.xworkz.cakes.service;

import java.util.List;

import com.xworkz.cakes.dto.CakesDto;

public interface CakesService {
	
	public boolean save(CakesDto dto);
	
	public List<CakesDto> readAll();
	
	public CakesDto findById(int id);
	
	public boolean updateNameById(String name, int id);
	
	public boolean deleteById(int id);
	
	public CakesDto findbyName(String name);

}
