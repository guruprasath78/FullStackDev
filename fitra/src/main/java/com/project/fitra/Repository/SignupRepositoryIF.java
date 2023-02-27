package com.project.fitra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.fitra.FitraModel.SiginupEntity;

public interface SignupRepositoryIF extends JpaRepository<SiginupEntity,Integer>
{

}
