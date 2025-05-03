package com.jpa.masala.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.masala.dto.MasalaDto;

public class MasalaRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("masalaData");
	EntityManager em = emf.createEntityManager();
	
	public boolean save(MasalaDto ... dtos ) {
		em.getTransaction().begin();
		for(MasalaDto dto : dtos) {
			em.merge(dto);
		}
		em.getTransaction().commit();
		return true;
	}
	
	public List<MasalaDto> readAll(){
		Query query = em.createNamedQuery("read", MasalaDto.class);
		return query.getResultList();
		
	}
	
	public List<MasalaDto> findByName(String name){
		Query query = em.createNamedQuery("find",MasalaDto.class);
		query.setParameter("brand", name);
		return query.getResultList();

	}
	
	public boolean updateQuantityByPrice(int quantity, int price) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update");
		query.setParameter("quantity", quantity);
		query.setParameter("price", price);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
	}
	
	public boolean deleteByType(String type) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("type", type);
		query.executeUpdate();
		em.getTransaction().commit();
		return true;
	}
	
}
