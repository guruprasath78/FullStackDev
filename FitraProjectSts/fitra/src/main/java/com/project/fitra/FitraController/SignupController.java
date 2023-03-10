package com.project.fitra.FitraController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.SiginupEntity;
import com.project.fitra.FitraService.SignupService;

@RestController
@CrossOrigin
public class SignupController {
	@Autowired
	SignupService obj;
	
	@GetMapping("/getsignup")
	public List<SiginupEntity>get()
	{
		return obj.getsignupDetails();
	}
	@PostMapping("/postsignup")
	public void post(@RequestBody SiginupEntity se)
	{
		obj.save(se);
	}
	@PutMapping("/putsignup")
	public void put(@RequestBody SiginupEntity ge,@RequestParam int id)
	{
		System.out.println(ge);
		System.out.println(id);
		ge.setId(id);
		obj.save(ge);
	}
	@DeleteMapping("/deletesignup")
	public void delete(@RequestParam int id)
	{
		obj.delete(id);
	}
}
