package com.example.AddNumbersSpring.domain;

public class Addition {
	private int num1;
	private int num2;
	
//	generating getters and setters method
	//Get num1
	public int getNum1() {
		return num1;
	}
	//Set num1
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	
	//Get num2
	public int getNum2() {
		return num2;
	}
	//Set num2
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int Total() {
		return num1 + num2;
	}
	
	
}
