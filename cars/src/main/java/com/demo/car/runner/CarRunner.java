package com.demo.car.runner;

import com.demo.car.dto.CarDto;
import com.demo.car.service.CarService;
import com.demo.car.service.CarServiceImpl;

public class CarRunner {
	
	private static CarService service = new CarServiceImpl();

	public static void main(String[] args) {
		
		CarDto d2 = new CarDto(2, "Mahindra", "Thar", "SUV", 4);
		CarDto d1 = new CarDto(1, "Honda", "City", "Sedan", 5);
		CarDto d3 = new CarDto(3, "Honda", "Amaze", "Sedan", 5);
		
		service.save(d3);
		
//		System.out.println(service.readAll());
//		System.out.println(service.findByBrand("Honda"));
		
//		service.updateSeatByType(4, "Sedan");
//		service.deleteByType("SUV");
		
		
	}
	
}
