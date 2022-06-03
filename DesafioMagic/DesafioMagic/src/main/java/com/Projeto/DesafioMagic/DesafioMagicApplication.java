package com.Projeto.DesafioMagic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.Projeto.DesafioMagic"})
public class DesafioMagicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioMagicApplication.class, args);
	
	}
}
