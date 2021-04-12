package com.java.ex;

public class MainClass {

	public static void main(String[] args) {
		// Test
		System.out.println("Hello");

		Calculation calculation = new Calculation();
		calculation.setFirstNum(10);
		calculation.setSecondNum(5);


		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();
		calculation.add();

		Calculation calculation2 = new Calculation();
	}

}
