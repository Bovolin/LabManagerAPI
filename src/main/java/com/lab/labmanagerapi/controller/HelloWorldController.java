package com.lab.labmanagerapi.controller;

import com.lab.labmanagerapi.domain.User;
import com.lab.labmanagerapi.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld(){
        return helloWorldService.helloWorld("Hello World Filipe");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestBody User body){
        return "Hello World " + body.getName() + id;
    }
}
