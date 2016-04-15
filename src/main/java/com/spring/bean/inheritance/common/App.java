package com.spring.bean.inheritance.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/spring/bean/inheritance/springInheritance.xml");

			Customer cust = (Customer) context.getBean("CustomerBean");
			System.out.println(cust);

			ApplicationContext context2 = new ClassPathXmlApplicationContext(
					"com/spring/bean/inheritance/springInheritAbstractOverride.xml");

			// allow to override the inherited value by specify the new value in
			// the child bean.
			Customer cust2 = (Customer) context2.getBean("CustomerBean");
			System.out.println(cust2);

			ApplicationContext context1 = new ClassPathXmlApplicationContext(
					"com/spring/bean/inheritance/springInheritanceAbstract.xml");

			// encounter the following error message Bean definition is
			// abstract.
			Customer cust1 = (Customer) context1.getBean("BaseCustomerMalaysia");
			System.out.println(cust1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
