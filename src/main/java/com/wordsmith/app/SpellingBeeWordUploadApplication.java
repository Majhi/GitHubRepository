package com.wordsmith.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration

public class SpellingBeeWordUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpellingBeeWordUploadApplication.class, args);
	}
}
