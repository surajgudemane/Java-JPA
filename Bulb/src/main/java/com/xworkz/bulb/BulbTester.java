package com.xworkz.bulb;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.service.BulbService;
import com.xworkz.bulb.service.BulbserviceImpl;

public class BulbTester {

	public static void main(String[] args) {
		
		BulbService service = new BulbserviceImpl();
		
		BulbDto dto1 = new BulbDto(1, "Surya", "Candle Bulb", "2 watt", 20);
		BulbDto dto2 = new BulbDto(2, "Havells", "Led Bulb", "10 watt", 120);
		BulbDto dto3 = new BulbDto(3, "Philips", "Led Bulb", "9 watt", 110);
		BulbDto dto4 = new BulbDto(4, "Orient", "T Bulb", "18 watt", 380);
		BulbDto dto5 = new BulbDto(5, "Syska", "Led Bulb", "30 watt", 550);
		BulbDto dto6 = new BulbDto(6, "V Gaurd", "Led Bulb", "15 watt", 300);
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
		
//		for(BulbDto list : service.readAll()) {
//			System.out.println(list);
//		}
		
//		System.out.println(service.findByName("Syska"));
		
//		System.out.println(service.findByType("Led Bulb"));
		
		for(BulbDto list : service.findByType("Led Bulb")){
			System.out.println(list);
		}
	}
	
}
