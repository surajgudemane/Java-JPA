package com.xworkz.cakes.repo;

import java.util.List;

import com.xworkz.cakes.dto.CakesDto;

public interface CakesRepo {

	public boolean save(CakesDto dto);
	
	public CakesDto findById(int id);
	
	public boolean updateNameById(String name, int id);
	
	public boolean deleteById(int id);

	public List<CakesDto> readAll();

	public CakesDto findByName(String name);

}
