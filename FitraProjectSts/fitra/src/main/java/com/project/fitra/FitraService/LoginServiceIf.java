package com.project.fitra.FitraService;

import java.util.List;


import com.project.fitra.FitraModel.LoginEntity;

public interface LoginServiceIf {
       public List<LoginEntity>getLogindetails();
       public void save(LoginEntity den);
}
