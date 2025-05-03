package com.demo.shoe.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.shoe.ShoeDto;

public class ShoeRepoImpl implements ShoeRepo {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("shoeData");
	EntityManager em = factory.createEntityManager();

	@Override
	public boolean save(ShoeDto ... dto) {
		if(em != null) {
			em.getTransaction().begin();
			for(ShoeDto dt : dto) {
				em.persist(dt);
			}
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}
