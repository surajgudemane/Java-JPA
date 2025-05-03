package com.jpa.shampoo.repo;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.shampoo.dto.ShampooDto;
import javax.persistence.Query;

public class ShampooRepoImpl implements ShampooRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShampooData");
	EntityManager e = emf.createEntityManager();
	
	@Override
	public boolean save(ShampooDto dto) {
		if(e != null) {
			e.getTransaction().begin();
			e.persist(dto);
			e.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List readAll() {
		Query q = e.createNamedQuery("readAll", ShampooDto.class);
		return q.getResultList();
	}

	@Override
	public List readByUseFor(String useFor) {
		Query q = e.createNamedQuery("readName", ShampooDto.class);
		q.setParameter("useFor", useFor);
		return q.getResultList();
	}

	@Override
	public boolean updateMlByPrice(int ml, int price) {
		if(e != null) {
			e.getTransaction().begin();
			Query q = e.createNamedQuery("update");
			q.setParameter("ml", ml);
			q.setParameter("price", price);
			q.executeUpdate();
			e.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByName(String ... name) {
		if(e != null) {
			e.getTransaction().begin();
			Query q = e.createNamedQuery("delete");
			for(String n : name) {
				q.setParameter("name", n);
				q.executeUpdate();
			}
			e.getTransaction().commit();
			return true;
		}
		return false;
	}

}
