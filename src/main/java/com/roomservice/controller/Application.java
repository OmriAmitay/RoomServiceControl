package com.roomservice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		System.setProperty("server.port", "8090");
		SpringApplication.run(Application.class, args);
	}

}