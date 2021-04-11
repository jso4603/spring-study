package com.java.springEx_07;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment environment = ctx.getEnvironment();

		MutablePropertySources propertySources = environment.getPropertySources();

		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));

			System.out.println(environment.getProperty("admin.id"));
			System.out.println(environment.getProperty("admin.pw"));
		} catch (IOException e) {
			// TODO: handle exception
		}

		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("applicationCTX.xml");
		gCtx.refresh();

		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("admin PW : " + adminConnection.getAdminPw());

		gCtx.close();
		ctx.close();

	}

}
