package com.blancoja.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
	@Value("Hola petardillo")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	
	
}
