package com.demo.shoe.repo;

import com.demo.shoe.ShoeDto;

public interface ShoeRepo {

	public boolean save(ShoeDto ... dto);
	
}
