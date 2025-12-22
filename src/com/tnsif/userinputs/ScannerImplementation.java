package com.tnsif.userinputs;
import java.util.Scanner;

public class ScannerImplementation{

	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter recharge pack: ");
		int rpo = scan.nextInt();
		scan.nextLine();
		
		
		System.out.println("Enter Carrier Name: ");
		String CarrierName = scan.nextLine();
		
		
		System.out.println("recharge pack :$" + rpo+"; Carrier Name: " + CarrierName);
		}
	
}
