package com.project.fitra.FitraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.TrackerModel;
import com.project.fitra.Repository.TrackerRepo;

@Service
public class TrackerService implements TrackerServiceIF {
	@Autowired
	TrackerRepo tr;
	@Override
	public List<TrackerModel> getTracker() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}
	public void save(TrackerModel tm)
	{
		tr.save(tm);
	}
}