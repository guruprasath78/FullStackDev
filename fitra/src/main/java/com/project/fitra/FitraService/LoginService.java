package com.project.fitra.FitraService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.LoginEntity;
import com.project.fitra.Repository.LoginRepositoryIF;
@Service
public class LoginService implements LoginServiceIf {
@Autowired
LoginRepositoryIF drg;
	@Override
	public List<LoginEntity> getLogindetails() {
		// TODO Auto-generated method stub
		return drg.findAll();
	}
	public void save(LoginEntity den)
	{
		drg.save(den);
	}
	public void delete(int n)
	{
		drg.deleteById(n);
	}
	public void deletebyemail(String n)
	{
		drg.deleteByemailid(n);
	}

}
