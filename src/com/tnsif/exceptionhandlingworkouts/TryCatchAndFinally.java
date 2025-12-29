package com.tnsif.exceptionhandlingworkouts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter the number : ");
			int number = scan.nextInt();
			System.out.println((number % 2 == 0 )? "Your no. is Even" : "Your no. is Odd");
			return;
		}
		
		catch (InputMismatchException e) {
			System.err.println("Invalid input");

		}
		
		finally {
			System.out.println("In Finally BLock");
			scan.close(); 
		}

	}

}
