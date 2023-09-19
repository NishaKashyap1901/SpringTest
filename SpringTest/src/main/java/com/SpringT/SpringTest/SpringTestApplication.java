package com.SpringT.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringTestApplication {

	public static  void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(SpringTestApplication.class, args);
		Office office = ap.getBean(coFounder.class); // Use the correct type for casting
office.lunch();
	}

}

