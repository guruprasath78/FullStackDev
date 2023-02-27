package com.project.fitra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.fitra.FitraModel.TrackerModel;

public interface TrackerRepo extends JpaRepository<TrackerModel, Integer> {

}
