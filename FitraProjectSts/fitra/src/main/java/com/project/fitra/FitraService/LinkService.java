package com.project.fitra.FitraService;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fitra.FitraModel.LinkEntity;
import com.project.fitra.Repository.LinkRepository;

@Service
public class LinkService implements LinkServiceIf {
       @Autowired
       LinkRepository LR;
       @Override
       public List<LinkEntity>getLinkDetails()
       {
    	   return LR.findAll();
       }
       public void save(LinkEntity le)
       {
    	   LR.save(le);
       }
}
