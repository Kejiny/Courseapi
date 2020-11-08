package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kejiny.demo.controller.TopicController;

@SpringBootApplication
@ComponentScan({"com.kejiny.demo.controller","com.kejiny.demo.service"})
public class CourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
