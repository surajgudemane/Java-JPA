package com.xworkz.bulb.repo;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.hql.internal.QueryExecutionRequestException;

import com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bulbdetails");
	EntityManager em = emf.createEntityManager();
	
	
	public boolean save(BulbDto dto) {
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		return true;
	}

	public List<BulbDto> readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll", BulbDto.class);
		em.getTransaction().commit();
		return query.getResultList();
	}

	public BulbDto findByName(String name) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("findByName", BulbDto.class);
		query.setParameter("name", name);
		em.getTransaction().commit();
		return (BulbDto) query.getSingleResult();
	}

	public List<BulbDto> findByType(String type) {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("findByType", BulbDto.class);
		query.setParameter("type", type);
		return query.getResultList();
	}

}
