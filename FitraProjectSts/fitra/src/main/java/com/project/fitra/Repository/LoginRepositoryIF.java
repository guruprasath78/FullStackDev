package com.project.fitra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.fitra.FitraModel.LoginEntity;

import jakarta.transaction.Transactional;

public interface LoginRepositoryIF extends JpaRepository<LoginEntity,Integer>{
	@Transactional
	public void deleteByemailid(String email);

}
