package org.formation.spring.report;

import org.springframework.stereotype.Component;

@Component("goatMilk")
public class GoatMilk implements ICheeseProcessor {

	public void milk() {
		System.out.println("this cheese came from " + this.getClass().getName());	}

	public void milk(String brand) {
		this.milk();
		System.out.println("& was marketed by " + brand);	
	}

}
