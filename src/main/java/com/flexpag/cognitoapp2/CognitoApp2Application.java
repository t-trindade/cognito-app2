package com.flexpag.cognitoapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class CognitoApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(CognitoApp2Application.class, args);
	}
}
