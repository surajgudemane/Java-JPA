package com.demo.car.service;

import java.util.List;

import com.demo.car.dto.CarDto;
import com.demo.car.repo.CarRepo;
import com.demo.car.repo.CarRepoImpl;

public class CarServiceImpl implements CarService {

	private CarRepo repo = new CarRepoImpl();
	
	@Override
	public boolean save(CarDto... dto) {
		return repo.save(dto);
	}

	@Override
	public List<CarDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<CarDto> findByBrand(String name) {
		return repo.findByBrand(name);
	}

	@Override
	public boolean updateSeatByType(int seat, String type) {
		return repo.updateSeatByType(seat, type);
	}

	@Override
	public boolean deleteByType(String type) {
		return repo.deleteByType(type);
	}

}
