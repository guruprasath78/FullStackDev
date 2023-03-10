package com.project.fitra.FitraController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.LoginEntity;
import com.project.fitra.FitraService.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService obj;
	
       @GetMapping("/getlogin")
       public List<LoginEntity> getLoginDetails()
       {
    	   return obj.getLogindetails();
       }
       @DeleteMapping("/deleteloginbyemail")
       public void deleteloginbyemail(@RequestParam String email)
       {
    	   obj.deletebyemail(email);
       }
       
}
