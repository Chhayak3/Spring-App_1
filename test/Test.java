package com.chhaya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chhaya.config.AppConfig;
import com.chhaya.config.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cc= new AnnotationConfigApplicationContext( AppConfig.class);
      Student s=cc.getBean(Student.class);
      s.study();
	}

}
