package com.xworkz.cakes.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.cakes.dto.CakesDto;

public class CakesRepoImpl implements CakesRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager(); 		
	
	public boolean save(CakesDto dto) {
		entityManager.getTransaction().begin();;
		entityManager.persist(dto);
		entityManager.getTransaction().commit();
		return true;
	}

	public CakesDto findById(int id) {
		entityManager.getTransaction().begin();
		CakesDto dto = entityManager.find(CakesDto.class, id);
		entityManager.getTransaction().commit();
		return dto;
	}

	public boolean updateNameById(String name, int id) {
		entityManager.getTransaction().begin();
		CakesDto dto = entityManager.find(CakesDto.class, id);
		dto.setName(name);
		entityManager.merge(dto);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean deleteById(int id) {
		
		entityManager.getTransaction().begin();
		CakesDto dto = entityManager.find(CakesDto.class, id);
		entityManager.remove(dto);
		entityManager.getTransaction().commit();
		return true;
	}

	public List<CakesDto> readAll() {
		entityManager.getTransaction().begin(); 
		Query query = entityManager.createNamedQuery("readall", CakesDto.class);
		entityManager.getTransaction().commit();
		return query.getResultList();
	}

	public CakesDto findByName(String name) {
		entityManager.getTransaction().begin(); 
		Query query = entityManager.createNamedQuery("findByName", CakesDto.class);
		query.setParameter("cakeName", name);
		entityManager.getTransaction().commit();
		return (CakesDto) query.getSingleResult();
	}

}
