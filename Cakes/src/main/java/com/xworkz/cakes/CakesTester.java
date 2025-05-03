package com.xworkz.cakes;

import com.xworkz.cakes.dto.CakesDto;
import com.xworkz.cakes.service.CakesService;
import com.xworkz.cakes.service.CakesServiceImpl;

public class CakesTester {

	public static void main(String[] args) {
		
		CakesDto dto1 = new CakesDto(1, "Cream Cake", "Painaple", "Round",999);
		CakesDto dto2 = new CakesDto(2, "Bread Cake", "Banana", "Square",1399);
		CakesDto dto3 = new CakesDto(3, "Cold Cake", "Ice", "Rectangle",1999);
		CakesDto dto4 = new CakesDto(4, "Choclate Cake", "Choclate", "Triangle",1599);
		CakesDto dto5 = new CakesDto(5, "Fruit Cake", "Mix Fruit", "Heart",799);
		
		CakesService service = new CakesServiceImpl();
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		
//		System.out.println(service.findById(3));
		
		service.updateNameById("Black Berry", 5);
//		service.deleteById(4);
//		System.out.println(service.findbyName("Fruit Cake"));
		
		for(CakesDto dto : service.readAll()) {
			System.out.println(dto);
			
		}
		
		
		
	}

}
