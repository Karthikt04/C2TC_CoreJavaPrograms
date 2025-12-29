package com.tnsif.threadingandmultithreading;

public class ExploringThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubThread threadOne = new SubThread(5, "First"); // creating child thread object
		SubThread threadTwo = new SubThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Master Thread"); // assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread, here to minimum priority
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
		try {
			threadOne.join(); // wait current thread until t1 is dead
			threadTwo.join(2000); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");

	}

}
