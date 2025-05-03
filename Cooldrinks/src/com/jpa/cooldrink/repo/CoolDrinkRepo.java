package com.jpa.cooldrink.repo;

import java.util.List;

import com.jpa.cooldrink.dto.CoolDrinkDto;

public interface CoolDrinkRepo {

	public boolean save(CoolDrinkDto dto);

	public List readAll();

	public List readByTaste(String taste);

	public CoolDrinkDto readById(int id);

	public boolean updateTasteById(String taste, int id);

	public boolean deleteByPrice(int price);

}
