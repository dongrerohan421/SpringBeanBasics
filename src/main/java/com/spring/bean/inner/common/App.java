package com.spring.bean.inner.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/spring/bean/inner/springAllModules.xml");

			Customer cust = (Customer) context.getBean("CustomerBean");
			Customer cust1 = (Customer) context.getBean("CustomerBean1");

			System.out.println("cust: " + cust + "\ncust1: " + cust1);
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
