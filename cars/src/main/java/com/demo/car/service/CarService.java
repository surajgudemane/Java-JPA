package com.demo.car.service;

import java.util.List;

import com.demo.car.dto.CarDto;

public interface CarService {
	
	public boolean save(CarDto ... dto);
	
	public List<CarDto> readAll();
	
	public List<CarDto> findByBrand(String name);
	
	public boolean updateSeatByType(int seat, String type);

	public boolean deleteByType(String type);

}
