package com.demo.car.repo;

import java.util.List;

import com.demo.car.dto.CarDto;

public interface CarRepo {

	public boolean save(CarDto... dto);

	public List<CarDto> readAll();

	public List<CarDto> findByBrand(String name);

	public boolean updateSeatByType(int seat, String type);

	public boolean deleteByType(String type);


}
