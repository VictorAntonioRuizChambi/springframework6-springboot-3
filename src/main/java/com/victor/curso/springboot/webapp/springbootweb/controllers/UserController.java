package com.victor.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.victor.curso.springboot.webapp.springbootweb.models.User;



@Controller
public class UserController {

    @GetMapping("/details")
    public String details( Model model) {
        User user = new User("Victor Antonio", "Ruiz Chambi");
        user.setEmail("varuizchambi@gmail.com");
        model.addAttribute("title", "Hola mundo Spring boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Pepa", "Gonzalez"),
            new User("Lalo", "Perez"),
            new User("Juanita", "Roe"),
            new User("Andrés", "Doe")
            );

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }
    

}
