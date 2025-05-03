package com.demo.fridge.runner;

import com.demo.fridge.dto.FridgeDto;
import com.demo.fridge.repo.FridgeRepo;
import com.demo.fridge.repo.FridgeRepoImpl;
import com.demo.fridge.service.FridgeService;
import com.demo.fridge.service.FridgeServiceImpl;

public class FridgeRunner {

	public static void main(String[] args) {
		
		FridgeService service = new FridgeServiceImpl();
		
		FridgeDto d1 = new FridgeDto(1, "LG", 430, 2, 25999); 
		FridgeDto d2 = new FridgeDto(2, "Haier", 340, 1, 17989); 
		FridgeDto d3 = new FridgeDto(3, "LG", 580, 3, 37899); 
		FridgeDto d4 = new FridgeDto(4, "BPL", 240, 1, 12899); 
		FridgeDto d5 = new FridgeDto(5, "Whirlpool", 410, 2, 22999); 
		
		
//		service.save(d1,d2,d3,d4,d5);
//		service.save(d3);
		
//		System.out.println(service.readAll());
		
//		System.out.println(service.findByName("LG"));
		
//		service.updateCapacityByDoor(460, 2);
		
//		service.deleteByPrice(37899);
	}
	
}
