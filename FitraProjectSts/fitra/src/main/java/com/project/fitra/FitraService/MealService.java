package com.project.fitra.FitraService;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.MealModel;
@Service
public class MealService implements MealServiceIF {

	static List  <MealModel> L=new ArrayList<>();
	static List <String> dummy1=new ArrayList<>();
	static List  <String>dummy2=new ArrayList<>();
	static
	{
		dummy1.add("1 Cup Almond with skin");
		dummy1.add("1 cups Pulsed cauliflower");
		dummy1.add("Sea salt to taste");
		dummy1.add("1/2 tsp Black Pepper powde");
		dummy1.add("1 tbsp Chopped fresh coriander");
		dummy1.add("2 tsp Lemon Juice");
		dummy1.add("1 tsp Chopped root ginger");
		dummy1.add("1 tsp Chopped green chilli");
		dummy1.add("1/2 tsp Cumin Seeds");
		dummy1.add("2 tbsp Olive Oil");
		dummy2.add("Roast the almonds with skin in preheated oven at 180 degree celsius for 4 minutes and cut into slivers, once it is cooled.");
		dummy2.add("In a pan, heat olive oil and crackle cumin seed, add chopped ginger, chopped green chilli and saute for 10-15 seconds.");
		dummy2.add("Stir-in pulsed cauliflower and cook for a minute or till tender.");
		dummy2.add("Take off the pan from flame and finish up with lemon juice, freshly chopped coriander and adjust seasoning with salt and pepper.");
		dummy2.add("Add roasted slivered almonds to it.");
		dummy2.add("Serve fluffy textured pulao.");
		MealModel mm=new MealModel(1,"Almond And Cauliflower Rice Salad ",dummy1,dummy2,35);
		L.add(mm);
	}
	@Override
	public List<MealModel> getMeal() {
		// TODO Auto-generated method stub
		return L;
	}

}
