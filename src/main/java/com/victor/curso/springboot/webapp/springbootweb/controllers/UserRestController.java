package com.victor.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.victor.curso.springboot.webapp.springbootweb.models.User;
import com.victor.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Victor Antonio", "Ruiz Chambi");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring boot");
        body.put("user", user);
        return body;
    }

    /* Es el mismo resultado que el método anterior solo que
     * en el @RequestMapping podemos especificar el tipo
     * de método que estamos definiendo, en este caso un GET,
     * si no se le especifica el método por defecto es de tipo GET
     */
    @RequestMapping(path="/details2", method = RequestMethod.GET)
    public Map<String, Object> detailsSameResults(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring boot");
        body.put("name", "Victor Antonio");
        body.put("lastname", "Ruiz Chambi");
        body.put("path", "/api/details2");
        return body;
    }

    @GetMapping("/details-dto")
    public UserDto detailsDto(){

        User user = new User("Victor Antonio", "Ruiz Chambi");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring boot with DTO");
        
        return userDto;
    }

    @RequestMapping("/list")
    public List<User> list() {
        User user1 = new User("Victor Antonio", "Ruiz Chambi");
        User user2 = new User("Diana Stephany", "Hinostroza Javier");
        User user3 = new User("Helena Historia", "Ruiz Hinostroza");

        List<User> users1 = Arrays.asList(user1, user2, user3);
        List<User> users2 = new ArrayList<>();
        users2.add(user1);
        users2.add(user2);
        users2.add(user3);
        return users1;
    }
}
