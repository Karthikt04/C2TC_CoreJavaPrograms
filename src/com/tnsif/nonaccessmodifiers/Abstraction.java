package com.tnsif.nonaccessmodifiers;

abstract class Fruits{
	
	abstract void juice();
	}

class Apple extends Fruits{
	
	void juice() {
		System.out.println("juicing a apple");
		}
}

public class Abstraction {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		app.juice();
		}
}