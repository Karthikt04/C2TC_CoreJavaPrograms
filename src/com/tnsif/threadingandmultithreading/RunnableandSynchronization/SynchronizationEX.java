package com.tnsif.threadingandmultithreading.RunnableandSynchronization;

class PrintTables {
    // Synchronized method
	synchronized void printTable(int n) {//locks one at a time
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class 1
class NewThread1 extends Thread {
    PrintTables t;

    NewThread1(PrintTables t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

// Thread class 2
class NewThread2 extends Thread {
    PrintTables t;

    NewThread2(PrintTables t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}


public class SynchronizationEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintTables obj = new PrintTables(); // Shared object

        NewThread1 nt1 = new NewThread1(obj);
        NewThread2 nt2 = new NewThread2(obj);

        nt1.start();
        nt2.start();

	}

}
