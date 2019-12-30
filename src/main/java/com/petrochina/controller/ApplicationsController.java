package com.petrochina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationsController {
    @RequestMapping(value = "/modeler",method = RequestMethod.GET)
    public String modeler(){
        return "modeler";
    }

    @RequestMapping(value="/defaultrestapi",method = RequestMethod.GET)
    public String swagger(){
        return "camunda-swagger-ui";
    }


    @RequestMapping(value="/restapi",method = RequestMethod.GET)
    public String restapi(){
        return "redirect:/swagger-ui.html";
    }
}
