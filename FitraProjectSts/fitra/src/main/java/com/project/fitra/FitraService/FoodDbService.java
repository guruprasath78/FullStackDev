package com.project.fitra.FitraService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.FoodDbEntity;
import com.project.fitra.Repository.FoodDbRepository;
@Service
public class FoodDbService implements FoodDbIF {
	@Autowired
	FoodDbRepository obj;
	@Override
	public List<FoodDbEntity> getData() {
		// TODO Auto-generated method stub
		return obj.findAll();
	}
	public void postdata(FoodDbEntity fde)
	{
		obj.save(fde);
	}
	public void deletedata(int id)
	{
		obj.deleteById(id);
	}

}
