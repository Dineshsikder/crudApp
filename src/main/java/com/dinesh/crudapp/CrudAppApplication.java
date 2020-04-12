package com.dinesh.crudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.dinesh.crudapp")
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

}
