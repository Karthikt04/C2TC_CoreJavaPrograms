package com.tnsif.polymorphism;

public class MethodOverloadingDemo{
	
	int addition(int a,int b)
	{
		return a + b;
	}
	
	float addition(float a,float b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo mold = new MethodOverloadingDemo();
		System.out.println("Addtion is: "+mold.addition(7, 12));
		System.out.println("Addtion is: "+mold.addition(7.0f, 5.0f));
		
		
	}

}