package com.blancoja.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.blancoja.interfaces.IEquipo;

//@Service //para servicios-- equivalente a Component,por programacion en capas, que el nombre se corresponda con el uso
//@Controller //para controlador-- equivalente a Component,por programacion en capas, que el nombre se corresponda con el uso
//@Repository //para programacion DAO-- equivalente a Component,por programacion en capas, que el nombre se corresponda con el uso
@Component("messi")
public class Jugador {

	@Value("10")
	private int numero;
	@Value("Lionel Messi")
	private String nombre;

	@Autowired
	//@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	//@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	
}
