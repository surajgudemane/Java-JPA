package com.demo.tv.service;

import java.util.List;

import com.demo.tv.dto.TvDto;
import com.demo.tv.repo.TvRepo;
import com.demo.tv.repo.TvRepoImpl;

public class TvServiceImpl implements TvService {

	private TvRepo repo = new TvRepoImpl();
	
	@Override
	public boolean save(TvDto... dto) {
		return repo.save(dto);
	}

	@Override
	public List<TvDto> readAll() {
		return repo.readAll();
	}

	@Override
	public List<TvDto> readById(int ... id) {
		return repo.readById(id);
	}

	@Override
	public boolean upadatePriceByName(int price, String name) {
		return repo.upadatePriceByName(price, name);
	}

	@Override
	public boolean deleteBySize(int size) {
		return repo.deleteBySize(size);
	}

}
