package com.project.fitra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.fitra.FitraModel.FoodDbEntity;

public interface FoodDbRepository extends JpaRepository<FoodDbEntity, Integer> {

}
