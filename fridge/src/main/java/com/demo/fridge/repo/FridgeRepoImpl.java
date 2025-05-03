package com.demo.fridge.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.fridge.dto.FridgeDto;

public class FridgeRepoImpl implements FridgeRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("fridgeData");
	EntityManager em = factory.createEntityManager();
	
	@Override
	public boolean save(FridgeDto[] dtos) {
		if(em != null) {
			em.getTransaction().begin();
			for(FridgeDto dto : dtos) {
				em.persist(dto);
			}
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<FridgeDto> readAll() {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", FridgeDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	@Override
	public List<FridgeDto> findByName(String name) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("find", FridgeDto.class);
			query.setParameter("brand", name);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	@Override
	public boolean updateCapacityByDoor(int capacity, int door) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("update");
			query.setParameter("capacity", capacity);
			query.setParameter("door", door);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByPrice(int price) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("delete");
			query.setParameter("price", price);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}
