package com.tnsif.nonaccessmodifiers;

public class StaticModDemo{
	static int count;
	
	int variable; // instance variable
	
	//static block
	static{
		
		count = 15;
		
		//variable = 20; Cannot make a static reference to a non-static variable
		
		System.out.println("Static vatiable count: "+count);
		}
	
	
	//static method
	static void display(){
		System.out.println("Static method with count: "+count);
		}
	
	
	public static void main(String[] args){
		
		System.out.println("Printing the main method");

		display();
		}

}
