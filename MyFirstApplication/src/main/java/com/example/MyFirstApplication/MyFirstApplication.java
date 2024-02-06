package com.example.MyFirstApplication;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;



@SpringBootApplication


public class MyFirstApplication {
private static final Logger logger=LoggerFactory.getLogger(MyFirstApplication.class);
public static void main(String[] args) {
		SpringApplication.run(MyFirstApplication.class, args);
		
	}

}
