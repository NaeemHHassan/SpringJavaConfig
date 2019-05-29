package com.softechsol.springjavaconfig.configfiles.annotatedfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Dao service = (Dao) context.getBean("service");
		service.create();

		Integer integer = (Integer) context.getBean("integer");
		System.out.println(integer);
	}

}
