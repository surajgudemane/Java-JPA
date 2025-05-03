package com.xworkz.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.biscuit.dto.BiscuitDto;

public class BiscuitRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		BiscuitDto dto1 = new BiscuitDto(1, "Parle-G", 5, "Humans", true);
		BiscuitDto dto2 = new BiscuitDto(2, "Marigold", 10, "Humans", false);
		BiscuitDto dto3 = new BiscuitDto(3, "Sunfest", 10, "Humans", true);
		BiscuitDto dto4 = new BiscuitDto(4, "Mari Lite", 10, "Humans", false);
		BiscuitDto dto5 = new BiscuitDto(5, "Bark Out", 30, "Dogs", false);
		BiscuitDto dto6 = new BiscuitDto(6, "Good Day", 10, "Humans", true);
		BiscuitDto dto7 = new BiscuitDto(7, "Bur Bon", 20, "Humans", true);
		BiscuitDto dto8 = new BiscuitDto(8, "Meat Up", 50, "Dogs", false);
		BiscuitDto dto9 = new BiscuitDto(9, "Dark Fantasy", 15, "Humans", true);
		BiscuitDto dto10 = new BiscuitDto(10, "Drools", 40, "Dogs", false);
		
//		entityManager.persist(dto1);
//		entityManager.persist(dto2);
//		entityManager.persist(dto3);
//		entityManager.persist(dto4);
		entityManager.persist(dto5);
//		entityManager.persist(dto6);
//		entityManager.persist(dto7);
//		entityManager.persist(dto8);
//		entityManager.persist(dto9);
//		entityManager.persist(dto10);
		
		BiscuitDto dto= entityManager.find(BiscuitDto.class, 9);
		
//		System.out.println(dto);
		
//		dto3.setName("Bounce");
//		entityManager.merge(dto3);
//		
//		entityManager.remove(dto);
//		System.out.println(dto);
		
		entityManager.getTransaction().commit();
	
	}

}
