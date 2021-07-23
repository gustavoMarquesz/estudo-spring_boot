package com.stormesteste.testandospringboot2;


import com.stormesteste.testandospringboot2.domain.Cota;
import com.stormesteste.testandospringboot2.repositories.ConnetionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TestandoSpringboot2Application implements CommandLineRunner {//command gerou o metodo abaixo
	@Autowired
	ConnetionRepository connetionRepository;//chamei o repository para fazer a conexao



	public static void main(String[] args) {
		SpringApplication.run(TestandoSpringboot2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cota c1 = new Cota(null,"Gustavo","gustavo99a@hotmail.com",
				"Churras","Asinha, Coxinha");
		
		Cota c2 = new Cota(null,"Guga","guga10@hotmail.com",
				"Coxinha","Coxinha, coca");

		connetionRepository.saveAll(Arrays.asList(c1,c2));



	}

}
