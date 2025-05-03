package com.xworkz.spects.service;

import java.util.List;

import com.xworkz.spects.dto.SpectsDto;
import com.xworkz.spects.repo.SpectsRepo;
import com.xworkz.spects.repo.SpectsRepoImpl;

public class SpectsServiceImpl implements SpectsService{

	SpectsRepo repo = new SpectsRepoImpl();
	
	public boolean SaveAll(List<SpectsDto> dto) {
		if(dto!= null) {
			for (SpectsDto list : dto) {
				 
					repo.saveAll(list);
					
			
			}return true;
		}
		return false;
	}

	public List<SpectsDto> readAll() {
		
		return repo.readAll();
	}

	public SpectsDto findById(int id) {
		if(id>0) {
			return repo.findById(id);
		}
		return null;
	}

	public SpectsDto findByShapeAndPrice(String shape, int price) {
		if(shape.length()>3 && price > 500) {
			return repo.findByShapeAndPrice(shape,price);
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if(price>1000 && name.length()>3) {
			return repo.updatePriceByName(price,name);
		}
		return false;
	}

	public boolean UpdateColorByPriceAndShape(String color, int price, String shape) {
		if(color.length()>2 && price>1000 && shape.length()>2) {
			return repo.UpdateColorByPriceAndShape(color,price,shape);
		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if(price>1000 && color.length()>3) {
			return repo.deleteByPriceAndColor(price,color);
		}
		return false;
	}

	public boolean deleteNameAndId(String name, int id) {
		if(name.length()>2 && id>0) {
			return repo.deleteNameAndId(name,id);
		}
		return false;
	}

}
