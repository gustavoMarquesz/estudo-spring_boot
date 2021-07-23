package com.stormesteste.testandospringboot2;

import com.stormesteste.testandospringboot2.domain.Pessoa;
import com.stormesteste.testandospringboot2.repositories.ConnetionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TestandoSpringboot2Application implements CommandLineRunner {
	@Autowired
	ConnetionRepository connetionRepository;



	public static void main(String[] args) {
		SpringApplication.run(TestandoSpringboot2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa(null,"Gustavo","gustavo99a@hotmail.com");
		Pessoa p2 = new Pessoa(null,"Gustavo","gustavo99a@hotmail.com");

		connetionRepository.saveAll(Arrays.asList(p1,p2));


	}
}
