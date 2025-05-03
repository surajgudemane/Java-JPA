package com.demo.tv.service;

import java.util.List;

import com.demo.tv.dto.TvDto;

public interface TvService {

	public boolean save(TvDto ... dto);
	
	public List<TvDto> readAll();
	
	public List<TvDto> readById(int ... id);
	
	public boolean upadatePriceByName(int price, String name);
	
	public boolean deleteBySize(int size);
	
}
