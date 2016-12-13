package org.formation.spring.test;

import org.formation.spring.service.CheeseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CheeseService cheeseService = context.getBean("cheeseService", CheeseService.class);
		cheeseService.setBrand("Lactalis");
		cheeseService.milk();
	}

}
