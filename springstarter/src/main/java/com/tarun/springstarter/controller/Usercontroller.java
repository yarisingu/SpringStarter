package com.tarun.springstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tarun.springstarter.service.UserService;

@Controller
public class Usercontroller {

    @Autowired
    UserService service;

    @RequestMapping("/login")
    public void login()
    {
        int id =1;
        String name = "tarun";
        service.login(id, name);
    }
    
    //@PathVariable int id, @PathVariable String name
}
