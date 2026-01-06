package com.tnsif.interfacedemo;

public class FunctionalInterExecute{
	public static void main(String[] args){
		
		//lambda expression
		FunctionalInter gd = () -> {
			System.out.println("Good Night! Sleep weslots");
			};
		
		gd.greet();
		}

}
