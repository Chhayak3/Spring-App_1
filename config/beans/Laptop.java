package com.chhaya.config.beans;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	public Laptop() {
		System.out.println("Laptop :: Constructor");
	}
	
	public void start() {
		System.out.println("Laptop is started");
	}
}
