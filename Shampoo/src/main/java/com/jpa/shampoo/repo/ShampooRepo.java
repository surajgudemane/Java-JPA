package com.jpa.shampoo.repo;

import java.util.List;

import com.jpa.shampoo.dto.ShampooDto;

public interface ShampooRepo {

	public boolean save(ShampooDto dto);
	
	public List readAll();
	
	public List readByUseFor(String name);
	
	public boolean updateMlByPrice(int ml, int price);
	
	public boolean deleteByName(String ... useFor);
	
}
