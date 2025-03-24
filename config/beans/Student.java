package com.chhaya.config.beans;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Student {
  //  @Autowired //It is used to inject the object into the reference laptop
	Laptop laptop;
	
//	public Student(Laptop laptop) {
//		this.laptop=laptop;
//	}

	@Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void study() {
		laptop.start();
		System.out.println("Student Starts Learning");
	}
}
