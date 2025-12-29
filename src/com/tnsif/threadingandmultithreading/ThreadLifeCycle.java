package com.tnsif.threadingandmultithreading;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubThread1 myThread = new SubThread1();
		System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
		myThread.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException exp) {
			System.err.println("=============== Thread is interrupted! ===============");
		}

		System.out.println("After complete execution of Thread --> alive or not? " + myThread.isAlive());

	}

}
