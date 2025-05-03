package com.demo.games.service;

import com.demo.games.dto.GamesDto;
import com.demo.games.repo.GamesRepo;
import com.demo.games.repo.GamesRepoImpl;

public class GamesServiceImpl implements GameService {

	private GamesRepo repo = new GamesRepoImpl();
	
	@Override
	public boolean save(GamesDto... dtos) {
		return repo.save(dtos);
	}

}
