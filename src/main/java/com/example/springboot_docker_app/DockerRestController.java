package com.example.springboot_docker_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {


    @GetMapping("/sayHello")
	public String sayHello() {
		return ("Welcome to Devops Demo");
	}

}
