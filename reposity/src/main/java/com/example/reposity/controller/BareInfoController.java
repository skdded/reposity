package com.example.reposity.controller;

import com.example.reposity.bean.BareInfo;
import com.example.reposity.service.BareInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class BareInfoController {

    @Autowired
    private BareInfoService bareInfoService;

    @RequestMapping("list")
    public String findAll(Model model){
        List<BareInfo> userList = bareInfoService.findAll();
        model.addAttribute("userList",userList);
        return "list";
    }

//    @RequestMapping("/addBareInfo")
    public String add(BareInfo bareInfo){
        System.out.println("进入了addController");
        bareInfoService.add(bareInfo);
        return "/list";
    }
}
