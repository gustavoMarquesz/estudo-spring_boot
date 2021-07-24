package com.stormesteste.testandospringboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan

public class TestandoSpringboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestandoSpringboot2Application.class, args);
	}
}
