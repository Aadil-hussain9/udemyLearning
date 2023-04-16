package com.vwits.todo.controller;


import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAutController {

    @GetMapping("/basicauth")
    public AuthenticationBean helloWordBean()
    {
        return new AuthenticationBean("You are authenticated");
    }

}
