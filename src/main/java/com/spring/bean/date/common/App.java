package com.spring.bean.date.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/bean/date/springDate.xml");

			Customer cust = (Customer) context.getBean("customer");
			System.out.println(cust);
		} catch (BeansException e) {
			System.out.println(e.getMessage());
		}
	}

}
