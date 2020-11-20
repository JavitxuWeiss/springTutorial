package com.blancoja.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean
	public Mundo mundo() {
		return new Mundo();
		
	}
		
}
