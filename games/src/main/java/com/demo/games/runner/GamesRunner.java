package com.demo.games.runner;

import com.demo.games.dto.GamesDto;
import com.demo.games.service.GameService;
import com.demo.games.service.GamesServiceImpl;

public class GamesRunner {

	public static void main(String[] args) {
		
		GameService service = new GamesServiceImpl();
		
		GamesDto d1 = new GamesDto(1, "GTA Vice City", "Open World", "14gb", 16, "Yes");
		GamesDto d2 = new GamesDto(2, "GTA V", "Open World", "69gb", 17, "No");
		GamesDto d3 = new GamesDto(3, "Cricker07", "Tactical", "12gb", 11, "Yes");
		GamesDto d4 = new GamesDto(4, "Call of Duty", "Action", "22gb", 15, "No");
		GamesDto d5 = new GamesDto(5, "IGI 2", "Action", "19gb", 13, "Yes");
		GamesDto d6 = new GamesDto(6, "WWE 2K16", "Action", "42gb", 14, "No");
		
		if(service.save(d1, d2, d3, d4, d5, d6)) {
			System.out.println("Saved Sucessfully");
		}
		
	}
	
}
