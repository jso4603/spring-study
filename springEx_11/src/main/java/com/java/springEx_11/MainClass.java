package com.java.springEx_11;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configString = null;

		System.out.print("환경모드를 선택하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		if (str.equals("dev")) {
			configString = "dev";
		} else if (str.equals("run")) {
			configString = "run";
		}

		scanner.close();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(configString);
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();

		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);

		System.out.println("ip : " + info.getIpNum());
		System.out.println("port : " + info.getPortNum());

		ctx.close();
	}

}
