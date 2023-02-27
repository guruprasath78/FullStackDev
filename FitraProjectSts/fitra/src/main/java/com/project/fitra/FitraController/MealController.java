package com.project.fitra.FitraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.MealModel;
import com.project.fitra.FitraService.MealService;

@RestController
public class MealController {

	@Autowired
	MealService obj;
	
	@GetMapping("/getmeal")
	public List<MealModel> get()
	{
		return obj.getMeal();
	}
}
