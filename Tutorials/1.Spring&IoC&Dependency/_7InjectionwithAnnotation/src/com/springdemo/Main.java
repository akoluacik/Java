package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		customerDal.add();
		System.out.println("@Component(database) can be used with only one entity class!");
	}

}
