package org.formation.spring.service;

import org.formation.spring.report.ICheeseProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cheeseService")
public class CheeseService {
	
	@Autowired
	@Qualifier("goatMilk")
	ICheeseProcessor iCheeseProcessor;
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setiCheeseProcessor(ICheeseProcessor iCheeseProcessor) {
		this.iCheeseProcessor = iCheeseProcessor;
	}

	public CheeseService() {}
	
	public void milk(){
		iCheeseProcessor.milk(getBrand());;
	}
	
	
}
