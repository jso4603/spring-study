package com.java.springEx_09;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;


public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env;
	private String adminId;
	private String adminPw;
	private String sub_adminId;
	private String sub_adminPw;

	// 맨 처음 콜백으로 호출
	// 설정환경 세팅
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);
	}

	// bean 생성 시
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	// bean 소멸 시
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public String getSub_adminId() {
		return sub_adminId;
	}

	public void setSub_adminId(String sub_adminId) {
		this.sub_adminId = sub_adminId;
	}

	public String getSub_adminPw() {
		return sub_adminPw;
	}

	public void setSub_adminPw(String sub_adminPw) {
		this.sub_adminPw = sub_adminPw;
	}

}
