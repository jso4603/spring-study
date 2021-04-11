package com.java.springEx_06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");

		ctx.refresh();

		Student student1 = ctx.getBean("student", Student.class);

		System.out.println(student1.getName());
		System.out.println(student1.getAge());

		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("장선옥");
		student2.setAge(29);

		System.out.println(student1.getName());
		System.out.println(student1.getAge());

		if (student1.equals(student2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("student1 != student2");
		}

		ctx.close();
	}

}
