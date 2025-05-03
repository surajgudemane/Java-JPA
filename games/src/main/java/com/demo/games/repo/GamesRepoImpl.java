package com.demo.games.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.games.dto.GamesDto;

public class GamesRepoImpl implements GamesRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("gamesData");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(GamesDto... dtos) {
		if(em != null) {
			em.getTransaction().begin();
			for(GamesDto dt : dtos) {
				System.out.println(dt);
				em.persist(dt);
			}
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}
