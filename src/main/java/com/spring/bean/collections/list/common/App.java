package com.spring.bean.collections.list.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/bean/collections/list/customerList.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
	}

}
