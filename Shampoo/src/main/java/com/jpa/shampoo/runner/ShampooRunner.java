package com.jpa.shampoo.runner;

import com.jpa.shampoo.dto.ShampooDto;
import com.jpa.shampoo.repo.ShampooRepo;
import com.jpa.shampoo.repo.ShampooRepoImpl;

public class ShampooRunner {

	public static void main(String[] args) {
		
		ShampooRepo repo = new ShampooRepoImpl();
		
		ShampooDto d1 = new ShampooDto("Dove", 6, "Human", 2);
		ShampooDto d2 = new ShampooDto("Chick", 8, "Dog", 4);
		ShampooDto d3 = new ShampooDto("Dove", 7, "Cat", 4);
		ShampooDto d4 = new ShampooDto("Sunsilk", 6, "Horse", 2);
		ShampooDto d5 = new ShampooDto("Himalaya", 4, "Human", 2);
		
//		repo.save(d2);
		
//		System.out.println(repo.readAll());
		
		System.out.println(repo.readByUseFor("Human"));
		
//		repo.updateMlByPrice(5,2);
		
//		repo.deleteByName("chick", "dove");
		
		
	}
	
}
