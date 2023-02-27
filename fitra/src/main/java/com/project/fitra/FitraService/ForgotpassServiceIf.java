package com.project.fitra.FitraService;

import java.util.List;


import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.ForgotpassModel;
@Service
public interface ForgotpassServiceIf {
       public List<ForgotpassModel> getForgotpass();
}
