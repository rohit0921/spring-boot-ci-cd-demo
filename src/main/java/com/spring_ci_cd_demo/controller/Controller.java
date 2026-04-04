package com.spring_ci_cd_demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testme")
@CrossOrigin(origins = "*")
public class Controller {
	
	@GetMapping
	public String testme() {
		return "This is proof it works !";
	}
	
	public String getContent() {
		return " C/CD Workfolw of SpringBoot + GitHub Acions + AWS EC2 Deployment Implemented";
	}
}
