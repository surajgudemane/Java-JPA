package com.demo.fridge.service;

import java.util.List;

import com.demo.fridge.dto.FridgeDto;
import com.demo.fridge.repo.FridgeRepo;
import com.demo.fridge.repo.FridgeRepoImpl;

public class FridgeServiceImpl implements FridgeService {

	private static FridgeRepo repo = new FridgeRepoImpl();
	
	@Override
	public boolean save(FridgeDto... dtos) {
		return repo.save(dtos);
	}

	@Override
	public List<FridgeDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<FridgeDto> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public boolean updateCapacityByDoor(int capacity, int door) {
		return repo.updateCapacityByDoor(capacity,door);
	}

	@Override
	public boolean deleteByPrice(int price) {
		return repo.deleteByPrice(price);
	}

}
