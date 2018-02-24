package com.patternson.oauth2baeldungauthorzationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class Oauth2BaeldungAuthorzationServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2BaeldungAuthorzationServerApplication.class, args);
	}
}
