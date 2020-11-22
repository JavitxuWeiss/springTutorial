package com.blancoja.beans;

import org.springframework.stereotype.Component;

import com.blancoja.interfaces.IEquipo;

//@Component
public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		
		return "FC Barcelona";
	}

	
}
