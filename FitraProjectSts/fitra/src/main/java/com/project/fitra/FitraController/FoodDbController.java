package com.project.fitra.FitraController;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.FoodDbEntity;
import com.project.fitra.FitraService.FoodDbService;

@RestController
public class FoodDbController {

	@Autowired
	FoodDbService obj;
	@GetMapping("/getfooddb")
	public List<FoodDbEntity> getfooddb()
	{
		return obj.getData();
	}
	@PostMapping("/postfooddb")
	public void post(@RequestBody FoodDbEntity fe)
	{
		obj.postdata(fe);
	}
	@DeleteMapping("/deletefooddb")
	public void delete(@RequestParam int id)
	{
		obj.deletedata(id);
	}
}
