package com.project.fitra.FitraController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.ProgressModel;
import com.project.fitra.FitraService.ProgressService;

@RestController
public class ProgressController {

	@Autowired
	ProgressService obj;
	
	@GetMapping("/getprogress")
	public List<ProgressModel> get()
	{
		return obj.getProgress();
	}
	@PostMapping("/postprogress")
	public void save(@RequestBody ProgressModel pm)
	{
		pm.init();
		obj.postprogress(pm);
	}
}
