package com.jpa.cooldrink.service;

import java.util.List;

import com.jpa.cooldrink.dto.CoolDrinkDto;
import com.jpa.cooldrink.repo.CoolDrinkRepo;
import com.jpa.cooldrink.repo.CoolDrinkRepoImpl;

public class CoolDrinkServiceImpl implements CoolDrinkService {

	private CoolDrinkRepo repo = new CoolDrinkRepoImpl();
	
	@Override
	public boolean save(CoolDrinkDto dto) {
		return repo.save(dto);
	}

	@Override
	public List readAll() {
		return repo.readAll();
	}

	@Override
	public List readByTaste(String taste) {
		return repo.readByTaste(taste);
	}

	@Override
	public CoolDrinkDto readById(int id) {
		return repo.readById(id);
	}

	@Override
	public boolean updateTasteById(String taste, int id) {
		return repo.updateTasteById(taste, id);
	}

	@Override
	public boolean deleteByPrice(int price) {
		return repo.deleteByPrice(price);
	}

}
