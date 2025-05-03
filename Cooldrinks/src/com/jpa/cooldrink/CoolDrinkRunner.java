package com.jpa.cooldrink;

import com.jpa.cooldrink.dto.CoolDrinkDto;
import com.jpa.cooldrink.service.CoolDrinkService;
import com.jpa.cooldrink.service.CoolDrinkServiceImpl;

public class CoolDrinkRunner {

	private static CoolDrinkService service = new CoolDrinkServiceImpl();
	
	public static void main(String[] args) {
		
		CoolDrinkDto d1 = new CoolDrinkDto("7 up", "350ml", "Lemon", 32);
		
		System.out.println(service.save(d1) ? "Saved Sucessgully" : "Save Operation went Wrong");
		
		System.out.println(service.readAll());
		
		System.out.println(service.readByTaste("Lemon"));
		
		System.out.println(service.readById(4));
		
		System.out.println(service.updateTasteById("Cola", 1) ? "updated Sucessgully" : "Update Operation went Wrong");
		
		System.out.println(service.deleteByPrice(32) ? "Delete Sucessgully" : "Delete Operation went Wrong");
		
	}
	
}
