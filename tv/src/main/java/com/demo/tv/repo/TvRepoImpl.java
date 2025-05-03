package com.demo.tv.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.tv.dto.TvDto;

public class TvRepoImpl implements TvRepo{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("tvData");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public boolean save(TvDto... dto) {
		if(em != null) {
			em.getTransaction().begin();
			for(TvDto dt : dto) {
				em.persist(dt);
			}
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<TvDto> readAll() {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", TvDto.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	@Override
	public List<TvDto> readById(int ... id) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readById", TvDto.class);
			List<TvDto> list = new ArrayList<TvDto>();
			for(int i : id) {
				query.setParameter("id", i);
				list.add((TvDto) query.getSingleResult());
			}
			em.getTransaction().commit();
			return list;
		}
		return null;
	}

	@Override
	public boolean upadatePriceByName(int price, String name) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("update");
			query.setParameter("price", price);
			query.setParameter("name", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBySize(int size) {
		if(em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("delete");
			query.setParameter("size", size);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}
