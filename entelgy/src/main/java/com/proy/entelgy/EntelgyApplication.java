package com.proy.entelgy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.proy.entelgy")
public class EntelgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntelgyApplication.class, args);
	}

}
