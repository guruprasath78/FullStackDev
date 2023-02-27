package com.project.fitra.FitraController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.ForgotpassModel;
import com.project.fitra.FitraService.ForgotpassService;

@RestController
public class ForgotpassController {
     @Autowired
     ForgotpassService obj;
     
     @GetMapping("/getforgotpass")
	private List<ForgotpassModel> getForgotpass() {
		// TODO Auto-generated method stub
	 return obj.getForgotpass();
	}
}
