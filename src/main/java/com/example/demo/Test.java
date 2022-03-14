package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans loaded");
		Customer customer1 =context.getBean("c1", Customer.class);
		customer1.displayInfo();

	}

}
