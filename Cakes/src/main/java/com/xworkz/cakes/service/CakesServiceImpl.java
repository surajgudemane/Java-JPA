package com.xworkz.cakes.service;

import java.util.List;

import com.xworkz.cakes.dto.CakesDto;
import com.xworkz.cakes.repo.CakesRepo;
import com.xworkz.cakes.repo.CakesRepoImpl;

public class CakesServiceImpl implements CakesService {
	
	private CakesRepo repo = new CakesRepoImpl();

	public boolean save(CakesDto dto) {
		if(dto != null) {
			if(dto.getId() > 0) {
				if(dto.getName().length() > 4) {
					System.out.println("Data is Validated and Passing to Repository");
					return repo.save(dto);
				}
			}
			System.out.println("Invalid Data");
		}
		return false;
	}

	public CakesDto findById(int id) {
		if(id >0) {
			return repo.findById(id);
		}
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if(name.length() > 4 && id >0) {
			return repo.updateNameById(name, id);
		}
		return false;
	}

	public boolean deleteById(int id) {
		if(id > 0) {
			return repo.deleteById(id);
		}
		return false;
	}

	public List<CakesDto> readAll() {
		
		return repo.readAll();
	}

	public CakesDto findbyName(String name) {
		
		return repo.findByName(name);
	}

}
