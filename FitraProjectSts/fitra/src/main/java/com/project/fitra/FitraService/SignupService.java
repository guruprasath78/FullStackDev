package com.project.fitra.FitraService;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.SiginupEntity;
import com.project.fitra.Repository.SignupRepositoryIF;

@Service
public class SignupService implements SignupServiceIf {
  
	@Autowired
	SignupRepositoryIF mon;
	@Override
	public List<SiginupEntity>getsignupDetails() {
		return mon.findAll();
	}
	public void save(SiginupEntity dek) {
		
	   mon.save(dek);
	}
	public void delete(int id)
	{
		mon.deleteById(id);
	}
	

}
