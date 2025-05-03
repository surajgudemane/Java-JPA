package com.demo.tv.runner;

import com.demo.tv.dto.TvDto;
import com.demo.tv.service.TvService;
import com.demo.tv.service.TvServiceImpl;

public class TvRunner {

	public static void main(String[] args) {
		
		TvService sevice = new TvServiceImpl();
		
		TvDto d1 = new TvDto(1, "Croma", 32, "LCD", 14000);
		TvDto d2 = new TvDto(2, "MI", 48, "LED", 23990);
		TvDto d3 = new TvDto(3, "LG", 32, "LCD", 18900);
		
//		sevice.save(d1, d2,d3);
		System.out.println(sevice.readAll());
		
//		System.out.println(sevice.readById(1,2,3));
		
//		sevice.upadatePriceByName(15000, "Croma");
//		sevice.deleteBySize(48);
		
	}
	
}
