package com.project.fitra.FitraController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.TrackerModel;
import com.project.fitra.FitraService.TrackerService;

@RestController
public class TrackerController {

	@Autowired
	TrackerService obj;
	@GetMapping("/gettracker")
	public List<TrackerModel> get()
	{
		return obj.getTracker();
	}
	@PutMapping("/puttracker")
	public void put(@RequestBody TrackerModel ne,@RequestParam int id)
	{
		ne.setId(id);
		obj.save(ne);
	}
}
