package com.blancoja.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blancoja.beans.Mundo;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext appcontext= new ClassPathXmlApplicationContext("com/blancoja/xml/beans.xml");
		Mundo m = appcontext.getBean(Mundo.class); //dos maneras de acceder a un bean desde xml definition
		Mundo m2 = (Mundo) appcontext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		System.out.println(m2.getSaludo());
		
		((ConfigurableApplicationContext)appcontext).close();
		
	}
	
}
