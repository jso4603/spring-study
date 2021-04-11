package com.java.ex;

public class Calculation {

	private int firstNum;
	private int secondNum;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void add() {
		System.out.println("더하기");
		int result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);
		System.out.println("");
	}

	public void sub() {
		System.out.println("빼기");
		int result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);
		System.out.println("");
	}

	public void mul() {
		System.out.println("곱하기");
		int result = firstNum * secondNum;
		System.out.println(firstNum + " * " + secondNum + " = " + result);
		System.out.println("");
	}

	public void div() {
		System.out.println("나누기");
		int result = firstNum / secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + result);
		System.out.println("");
	}

}
