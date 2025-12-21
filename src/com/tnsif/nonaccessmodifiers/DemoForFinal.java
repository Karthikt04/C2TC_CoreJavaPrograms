package com.tnsif.nonaccessmodifiers;

final public class DemoForFinal{
	final int x = 199;
	
	final void print(){
		System.out.println("The value of x: "+ x);
		}

	public static void main(String[] args){
		
		DemoForFinal dff = new DemoForFinal();
		dff.print();
		//dff.x = 200; error - cannot be assigned
		dff.print();
		}
}
// cannot subclass a Final class
/*class Example extends DemoForFinal{
	void print() {
		
	}
}*/