package com.project.fitra.FitraService;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.ForgotpassModel;
@Service
public class ForgotpassService implements ForgotpassServiceIf {
	public static List<ForgotpassModel>L=new ArrayList<>();
	static
	{
		ForgotpassModel m1=new ForgotpassModel("aakash@12@gmail.com","45679","fitra12","fitra12");
		L.add(m1);
	}

	@Override
	public List<ForgotpassModel> getForgotpass() {
		// TODO Auto-generated method stub
		return L;
	}

}
