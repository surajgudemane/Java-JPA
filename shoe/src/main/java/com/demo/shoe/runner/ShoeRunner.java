package com.demo.shoe.runner;

import com.demo.shoe.ShoeDto;
import com.demo.shoe.service.ShoeService;
import com.demo.shoe.service.ShoeServiceImpl;

public class ShoeRunner {

	public static void main(String[] args) {
		
		ShoeService service = new ShoeServiceImpl();
		
		ShoeDto d1 = new ShoeDto(1, "Bata", 7, 2999);
		ShoeDto d2 = new ShoeDto(2, "Nike", 8, 4899);
		
		service.save(d1,d2);
		
	}

}
