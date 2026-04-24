package com.ash.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	//	Player ref = new Player(18,"Virat kohli",588,78); // hard code nhi krna h hmko
		//System.out.println(ref);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");  //interface h jo khud file ka resource dhundta h
		Player ref = (Player)ctx.getBean("ply");
		System.out.println(ref);
		
		Player ref2 = (Player)ctx.getBean("ply");
		
		
		if(ref == ref2)     //abhi output same hoga pr jbb hmko multiple object ke liye krna hoga to hmko config.xml me scope="prototype" dalna hoga
			System.out.println("same");
		else
			System.out.println("diff");
			
		

	}

}
