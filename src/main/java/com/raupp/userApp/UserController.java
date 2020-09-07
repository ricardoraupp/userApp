package com.raupp.userApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    private userRepository userRepository;
    @Value(("${organization.name}"))
    private String organizationName;
    @Value(("${service.welcome.message}"))
    private String welcomeMessage;

    @RequestMapping("/")
    public String getUser(){

        return "Welcome UserApp "+organizationName+" ***** "+welcomeMessage;
    }

    /*
    @RequestMapping("/")
    public List<User> getUser(){

        return userRepository.findAll();
    }
     */
    @RequestMapping("/course/{id}")
    public List<User> getUsersForACourse(@PathVariable("id") BigInteger id){

        return userRepository.findBycourseId(id);

    }
    @RequestMapping("/user/{id}")
    public List<User> getCourseForAUser(@PathVariable("id") BigInteger id){

        return userRepository.findByuserId(id);

    }


}
