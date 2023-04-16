package com.vwits.todo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.vwits.todo.controller", "com.vwits.todo.service",
		"com.vwits.todo.WebConfiguration","com.vwits.todo.SpringSecurityBasicAuth",
        "com.vwits.todo.jwts","com.vwits.todo.jwts.resource"})
@EntityScan("com.vwits.todo.Model")
@EnableJpaRepositories("com.vwits.todo.Repository")
public class TodoApplicationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplicationBackendApplication.class, args);
	}

}
