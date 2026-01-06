package com.tnsif.javacollections;

import java.util.Iterator;
import java.util.Vector;

public class VectorCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> cars = new Vector<>();
		cars.add("Hyundai");
		cars.add("Mustang");
		cars.add("Ford");

		System.out.println("Initial Vector: " + cars);
		// Using get()
		String element = cars.get(2);
		System.out.println("Element at index 2: " + element);

		// Using iterator()
		Iterator<String> iterate = cars.iterator();
		
		System.out.print("Vector: ");
		while (iterate.hasNext()) {
			System.out.print(iterate.next()+" ");
		}
		// Using remove()
		element = cars.remove(1);
		System.out.println("\nRemoved Element: " + element);
		System.out.println("New Vector: " + cars);

		// Using clear()
		cars.clear();
		System.out.println("Vector after clear(): " + cars);

	}

	
}
	