package com.blancoja.beans;


import org.springframework.stereotype.Component;

import com.blancoja.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo {

	@Override
	public String mostrar() {
		
		return "Juventus FC";
	}

}
