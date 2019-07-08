package com.example.reposity.controller;

import com.example.reposity.bean.BareInfo;
import com.example.reposity.service.BareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class BareInfoController2 {

    @Autowired
    private BareInfoService bareInfoService;


    @RequestMapping("/addBareInfo")
//    @PostMapping("/addBareInfo")
    public String add(BareInfo bareInfo){
        System.out.println("进入了addController");
        bareInfoService.add(bareInfo);
        return "list";
    }
}
