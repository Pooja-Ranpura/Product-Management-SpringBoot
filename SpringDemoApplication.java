package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

@SpringBootApplication
public class SpringDemoApplication {
	 
	/*public void configureViewResolvers(ViewResolverRegistry registry) {
	        registry.jsp("/src/main/resources/WEB-INF/jsp", ".jsp");
	    } */

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	


}
