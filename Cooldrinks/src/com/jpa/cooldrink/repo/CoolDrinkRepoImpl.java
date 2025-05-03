package com.jpa.cooldrink.repo;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.cooldrink.dto.CoolDrinkDto;

public class CoolDrinkRepoImpl implements CoolDrinkRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooldrinkdata");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(CoolDrinkDto dto) {
		if(em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<CoolDrinkDto> readAll() {
		Query query = em.createNamedQuery("readAll", CoolDrinkDto.class);
		return query.getResultList();
	}

	@Override
	public List readByTaste(String taste) {
		Query query = em.createNamedQuery("readByTaste", CoolDrinkDto.class);
		query.setParameter("taste", taste);
		return query.getResultList();
	}

	@Override
	public CoolDrinkDto readById(int id) {
		Query query = em.createNamedQuery("readById", CoolDrinkDto.class);
		query.setParameter("id", id);
		return (CoolDrinkDto) query.getSingleResult();
	}

	@Override
	public boolean updateTasteById(String taste, int id) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");
		query.setParameter("taste", taste);
		query.setParameter("id", id);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteByPrice(int price) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("price", price);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
	}

}
