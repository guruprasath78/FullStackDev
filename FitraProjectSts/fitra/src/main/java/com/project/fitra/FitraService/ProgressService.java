package com.project.fitra.FitraService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.ProgressModel;
import com.project.fitra.Repository.ProgressRep;

@Service
public class ProgressService implements ProgressServiceIF {
	@Autowired
	ProgressRep pr;
	@Override
	public List<ProgressModel> getProgress() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}
	public void postprogress(ProgressModel pm)
	{
		System.out.print(pm);
		pr.save(pm);
	}

}
