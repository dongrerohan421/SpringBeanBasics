package com.spring.bean.scope.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/spring/bean/scope/customerServiceScope.xml");

			CustomerService custA = (CustomerService) context.getBean("customerServiceSingleton");
			custA.setMessage("Message by custA");
			System.out.println("Message custA : " + custA.getMessage());

			CustomerService custB = (CustomerService) context.getBean("customerServiceSingleton");
			System.out.println("Message custB : " + custB.getMessage());

			CustomerService custC = (CustomerService) context.getBean("customerServiceSingleton");
			custA.setMessage("Message by custC");
			System.out.println("Message custC : " + custC.getMessage());

			CustomerService custD = (CustomerService) context.getBean("customerServicePrototype");
			System.out.println("Message custD : " + custD.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
