package com.escape.h2.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan({"com.escape.h2.database.controller","com.escape.h2.database.service"})
@EntityScan("com.escape.h2.database.entity")
@EnableJpaRepositories("com.escape.h2.database.repository")
@SpringBootApplication
//@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
