package com.tnsif.threadingandmultithreading;

public class Thread1 {

	public static void main(String[] args) {//main method is the main thread that always runs in a java program even when none thread is created
		// TODO Auto-generated method stub
		
		SubThread threadOne = new SubThread(5, "First");
		SubThread threadTwo = new SubThread(10, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException, thread already started
		// threadOne.run(); // can be used in single threaded application and not here
		threadTwo.start();

		System.out.println("==========================End of Main==========================");

	}

}
