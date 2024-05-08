package com.management_system.importation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ImportationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImportationApplication.class, args);
	}
}