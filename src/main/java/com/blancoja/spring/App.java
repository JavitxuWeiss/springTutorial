package com.blancoja.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blancoja.beans.Ciudad;
import com.blancoja.beans.Jugador;
//import com.blancoja.beans.AppConfig2;
//import com.blancoja.beans.Appconfig;
//import com.blancoja.beans.Mundo;
import com.blancoja.beans.Persona;
import com.blancoja.interfaces.IEquipo;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext appcontext= new ClassPathXmlApplicationContext("com/blancoja/xml/beans.xml");
		Jugador jug= (Jugador) appcontext.getBean("messi");
		
		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
		//IEquipo bar = (IEquipo) appcontext.getBean("barcelona");
		IEquipo juv = (IEquipo) appcontext.getBean("juventus");
		
		//System.out.println(bar.mostrar());
		System.out.println(juv.mostrar());
		
				
			
			
		((ConfigurableApplicationContext)appcontext).close();
		
	}
	
}
