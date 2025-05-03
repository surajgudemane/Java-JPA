package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbService {
	
	public boolean save(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findByName(String name);
	
	public List<BulbDto> findByType(String type);

}
