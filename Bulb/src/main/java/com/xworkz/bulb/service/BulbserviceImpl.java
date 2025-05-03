package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDto;
import com.xworkz.bulb.repo.BulbRepo;
import com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbserviceImpl implements BulbService {

	private BulbRepo repo = new BulbRepoImpl();
	
	public boolean save(BulbDto dto) {
		if(dto != null) {
			if(dto.getId() > 0) {
				System.out.println("DTO is validated and sending to Repository");
				return repo.save(dto);
			}
			System.out.println("Invalid Dto");
		}
		return false;
	}

	public List<BulbDto> readAll() {

		return repo.readAll();
	}

	public BulbDto findByName(String name) {
		if(name.length() > 4) {
			return repo.findByName(name);
		}
		return null;
	}

	public List<BulbDto> findByType(String type) {
		if(type.length() > 4) {
			return repo.findByType(type);
		}
		return null;
	}

}
