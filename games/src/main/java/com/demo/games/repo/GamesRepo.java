package com.demo.games.repo;

import com.demo.games.dto.GamesDto;

public interface GamesRepo {

	public boolean save(GamesDto ... dtos);

}
