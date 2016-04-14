package com.spring.bean.collections.set.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {

			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/spring/bean/collections/set/customerSet.xml");

			Customer cust = (Customer) context.getBean("CustomerBean");
			System.out.println(cust);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
