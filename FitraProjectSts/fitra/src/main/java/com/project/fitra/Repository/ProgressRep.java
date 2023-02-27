package com.project.fitra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.fitra.FitraModel.ProgressModel;

public interface ProgressRep extends JpaRepository<ProgressModel, Integer> {

}
