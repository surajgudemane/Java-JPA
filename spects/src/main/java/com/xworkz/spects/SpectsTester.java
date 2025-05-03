package com.xworkz.spects;

import java.util.Arrays;
import java.util.List;

import com.xworkz.spects.dto.SpectsDto;
import com.xworkz.spects.service.SpectsService;
import com.xworkz.spects.service.SpectsServiceImpl;

public class SpectsTester {

	public static void main(String[] args) {
		
		SpectsDto dto1 = new SpectsDto(1, "Ray Ban", "Circle", "Black", 3999);
		SpectsDto dto2 = new SpectsDto(2, "Polo", "Rectangle", "white", 4999);
		SpectsDto dto3 = new SpectsDto(3, "Guess", "circle", "greay", 2999);
		SpectsDto dto4 = new SpectsDto(4, "Kate Spade", "Oval", "yellow", 1899);
		SpectsDto dto5 = new SpectsDto(5, "Lafont", "Square", "green", 1999);
		SpectsDto dto6 = new SpectsDto(6, "Nine West", "triangle", "blue", 9699);
		SpectsDto dto7 = new SpectsDto(7, "Tom ford", "Oval", "orange", 5399);
		
		SpectsService serv = new SpectsServiceImpl();
		
		List<SpectsDto> list = Arrays.asList(dto1,dto2,dto3,dto4,dto5,dto6,dto7);
//		serv.SaveAll(list);
		
//		System.out.println(serv.readAll());
		
//		System.out.println(serv.findById(5));
		
//		System.out.println(serv.findByShapeAndPrice("Oval", 1899));
		
//		serv.updatePriceByName(5000, "Ray Ban");
		
//		serv.UpdateColorByPriceAndShape("Dark Red", 2999, "circle");
		
//		serv.deleteByPriceAndColor(1999, "green");
		
		serv.deleteNameAndId("Nine West", 6);
	}

}
