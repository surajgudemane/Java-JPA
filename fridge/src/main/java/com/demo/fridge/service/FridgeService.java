package com.demo.fridge.service;

import java.util.List;

import com.demo.fridge.dto.FridgeDto;

public interface FridgeService {

	public boolean save(FridgeDto ...dtos );
	
	public List<FridgeDto> readAll();
	
	public List<FridgeDto> findByName(String name);
	
	public boolean updateCapacityByDoor(int capacity, int door);
	
	public boolean deleteByPrice(int price);
}
