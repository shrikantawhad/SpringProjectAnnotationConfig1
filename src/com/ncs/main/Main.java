package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc = "/com/ncs/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = context.getBean(Student.class);
		std.display();
	}
}
