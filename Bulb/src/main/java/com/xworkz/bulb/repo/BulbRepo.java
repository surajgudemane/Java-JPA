package com.xworkz.bulb.repo;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;

public interface BulbRepo {

	public boolean save(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findByName(String name);
	
	public List<BulbDto> findByType(String type);

}
