package com.project.fitra.FitraService;

import java.util.List;


import com.project.fitra.FitraModel.SiginupEntity;

public interface SignupServiceIf {
      public List<SiginupEntity>getsignupDetails();
      public void save(SiginupEntity dek);
}
