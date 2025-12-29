package com.tnsif.threadingandmultithreading;

public class SubThread1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Inside run()-->Thread is alive or not? " + this.isAlive());
		int no = 0;
		while (no < 4) {
			no++;
			System.out.println("number : " + no);
			try {
				sleep(3000);

			} catch (InterruptedException exp) {
				System.err.println("=============== Thread Interrupted ===============");
			}
		}
	}

}
