package com.demo.car.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.car.dto.CarDto;

public class CarRepoImpl implements CarRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarData");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public  boolean save(CarDto ... dto) {
		if(em != null) {
			em.getTransaction().begin();
			for(CarDto dt : dto) {
				em.persist(dt);
			}
			em.getTransaction().commit();
			return true;
		}
		return false;
	}
	
	@Override
	public List<CarDto> readAll(){
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", CarDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}
	
	@Override
	public List<CarDto> findByBrand(String name){
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByBrand", CarDto.class);
			query.setParameter("brand", name);
			em.getTransaction().commit();
			return (List<CarDto>) query.getResultList();
		}
		return null;
	}
	
	@Override
	public boolean updateSeatByType(int seat, String type) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateSeatByType");
			query.setParameter("noSeats", seat);
			query.setParameter("type", type);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteByType(String type) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByType");
			query.setParameter("type", type);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return true;
	}
	
}
