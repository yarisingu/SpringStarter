package com.tarun.springstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String redricite()
    {
        return "tarun";
    }
}
