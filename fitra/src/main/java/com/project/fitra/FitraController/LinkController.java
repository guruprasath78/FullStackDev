package com.project.fitra.FitraController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.fitra.FitraModel.LinkEntity;
import com.project.fitra.FitraService.LinkService;

@RestController
public class LinkController {
    @Autowired
    LinkService obj;
    @GetMapping("/getlink")
    public List<LinkEntity>get()
    {
    	return obj.getLinkDetails();
    }
    @PostMapping("/savelink")
    public void savedata(@RequestBody LinkEntity le)
    {
    	System.out.print(le);
    	obj.save(le);
    }
}
