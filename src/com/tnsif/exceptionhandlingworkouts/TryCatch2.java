package com.tnsif.exceptionhandlingworkouts;

public class TryCatch2 {
	
	public static void main(String[] args) {
		System.out.println("In main method");
		int result;
		try {

			result = TryCatch1.Division(12, 0);
			if (result != 0)
				System.out.println("Divisin is " + result);

			System.out.println("=====================================================");

			result = TryCatch1.Division(12, 5);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("=====================================================");
		} catch (ArithmeticException e) {
			System.out.println("In catch block: " + e.getMessage());
			
			e.printStackTrace();
		}
		System.out.println(TryCatch1.Division(12f, 7f));

		System.out.println("=====================================================");
		System.out.println(TryCatch1.Division(12f, 0f));

	}

}
