package com.victor.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user-controller")
public class UserControllerWithRequestMapping {

    @GetMapping("/details")
    @ResponseBody
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring boot");
        body.put("name", "Victor Antonio");
        body.put("lastname", "Ruiz Chambi");
        return body;
    }

}
