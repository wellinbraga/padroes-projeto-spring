package br.com.stackmob.padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Projeto criado via Spring Initializr
 *  Modulos:
 *  - Spring JPA
 *  - Spring Web
 *  - H2 Database
 *  - Openfeing
 *  
 *  @author Wellington
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
