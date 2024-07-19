package com.simpleProjeect.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context = 
		SpringApplication.run(SpringProjectApplication.class, args);

		// Alien a = context.getBean(Alien.class);
		// a.setName("Ibuka");
		// a.getName();
		// System.out.println(a.getName());
	}

}
