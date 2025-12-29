package com.tnsif.exceptionhandlingworkouts;

import java.util.Scanner;

class InvalidBalanceException extends Exception {
    InvalidBalanceException(String message) {
        super(message);
    }
}

public class CustomException {
	
	static void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000) {
            throw new InvalidBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter balance(must be above 999 or throws custom exception: ");
		int bal=scan.nextInt();
		try {
            withdraw(bal);
        }
		catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
		scan.close();

	}

}
