package com.blancoja.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blancoja.beans.Ciudad;
//import com.blancoja.beans.AppConfig2;
//import com.blancoja.beans.Appconfig;
//import com.blancoja.beans.Mundo;
import com.blancoja.beans.Persona;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext appcontext= new ClassPathXmlApplicationContext("com/blancoja/xml/beans.xml");
		Persona per= (Persona) appcontext.getBean("personaBean2");
		/*
		 * AnnotationConfigApplicationContext appcontext= new
		 * AnnotationConfigApplicationContext(Appconfig.class,AppConfig2.class);
		 * appcontext.register(Appconfig.class); appcontext.register(AppConfig2.class);
		 * appcontext.refresh();
		 */
		//Mundo m = appcontext.getBean(Mundo.class); //dos maneras de acceder a un bean desde xml definition
		//Mundo m2 = (Mundo) appcontext.getBean("marte");
		
		String cadenaCiudades="";
		for(Ciudad ciudadActual : per.getPais().getCiudades()) {
			cadenaCiudades += ciudadActual.getNombre() + "-";
			
			
		}

		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + cadenaCiudades);
		
		((ConfigurableApplicationContext)appcontext).close();
		
	}
	
}
