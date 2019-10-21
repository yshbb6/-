package com.dzkj2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.dzkj.mapper")
public class Start {
	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
	}
}
