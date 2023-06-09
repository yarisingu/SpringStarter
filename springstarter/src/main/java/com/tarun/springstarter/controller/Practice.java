package com.tarun.springstarter.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("Practice")
public class Practice {

    @RequestMapping(value = "/firstacess")
    public void passresponce(HttpServletResponse res) throws IOException
    {
         res.sendRedirect("https://www.google.com/");
    }
    
}
