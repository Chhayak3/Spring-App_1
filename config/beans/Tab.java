package com.chhaya.config.beans;
import org.springframework.stereotype.Component;

@Component
public class Tab {
	
	public Tab() {
		System.out.println("Tab:: Constructor");
	}
	
	public void start() {
	
System.out.println("Tab is Started");
	}
}
