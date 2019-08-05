package com.example.demo.controller;

import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/get")
    public ModelAndView getName(HttpServletRequest request, HttpServletResponse response){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = personService.getPerson(id).getName();
        ModelAndView mav = new ModelAndView("main");
        mav.addObject("name", name);
        return mav;
    }
}
