package com.demo.shoe.service;

import com.demo.shoe.ShoeDto;
import com.demo.shoe.repo.ShoeRepo;
import com.demo.shoe.repo.ShoeRepoImpl;

public class ShoeServiceImpl implements ShoeService {

	private ShoeRepo repo = new ShoeRepoImpl();
	
	@Override
	public boolean save(ShoeDto ... dto) {
		return repo.save(dto);
	}

}
