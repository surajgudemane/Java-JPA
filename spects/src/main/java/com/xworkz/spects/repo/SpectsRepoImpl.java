package com.xworkz.spects.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.spects.dto.SpectsDto;

public class SpectsRepoImpl implements SpectsRepo{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();
	
	public boolean saveAll(SpectsDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}

	public List<SpectsDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll",SpectsDto.class);
		
		em.getTransaction().commit();
		return query.getResultList();
	}

	public SpectsDto findById(int id) {
		em.getTransaction().begin();
		SpectsDto dto= em.find(SpectsDto.class, id);
		em.getTransaction().commit();
		return dto;
	}

	public SpectsDto findByShapeAndPrice(String shape, int price) {
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("findByShapeAndPrice",SpectsDto.class);
		query.setParameter("type", shape);
		query.setParameter("price", price);
		em.getTransaction().commit();
		return (SpectsDto) query.getSingleResult();
	}

	public boolean updatePriceByName(int price, String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("UpdatepriceByName");
		query.setParameter("price", price);
		query.setParameter("name", name);
		query.executeUpdate();
		return true;
	}

	public boolean UpdateColorByPriceAndShape(String color, int price, String shape) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("UpdateColorByPriceAndShape");
		query.setParameter("color", color);
		query.setParameter("price", price);
		query.setParameter("shape", shape);
		query.executeUpdate();
		return true;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deletePriceAndColor");
			query.setParameter("price", price);
			query.setParameter("color", color);
			query.executeUpdate();
			return true;
		}
		return false;
	}

	public boolean deleteNameAndId(String name, int id) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteNameAndId");
			query.setParameter("name", name);
			query.setParameter("id", id);
			query.executeUpdate();
			return true;
		}
		return false;
	}

}
