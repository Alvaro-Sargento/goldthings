package com.goldthings.loja.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoldthingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldthingsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello world, f**ick Working";
	}

}
