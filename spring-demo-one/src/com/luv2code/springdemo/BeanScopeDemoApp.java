package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
	    boolean result=(theCoach==alphaCoach);
	    System.out.println("\n pointing to the same object: " +result);
	    
	    System.out.println("\n Memory location of theCoach\"" +theCoach);
	    
	    System.out.println("\n Memory location of alphaCoach" +alphaCoach);

	    context.close();
	}

}
