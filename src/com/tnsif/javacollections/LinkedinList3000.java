package com.tnsif.javacollections;

import java.util.Collections;
import java.util.ListIterator;
import java.util.LinkedList;

public class LinkedinList3000 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> slots = new LinkedList <Integer> ();
		
		slots.add(500);
		slots.add(700);
		slots.add(40);
		slots.addFirst(48);
		slots.add(2, 42);
		slots.addLast(77);
		slots.add(900);

		System.out.println("Number List is " + slots);

		System.out.println("First Element is " + slots.getFirst());
		System.out.println("Last Element is " + slots.getLast());

		slots.removeFirst();
		slots.removeLast();

		System.out.println("Number List after removing first and last element is " + slots);

		ListIterator<Integer> li = slots.listIterator();

		while (li.hasNext())
			System.out.print(li.next() + "\t");
		

		li = slots.listIterator(slots.size());
		
		while (li.hasPrevious()) {
			int n = li.previous();
			System.out.print(n + "\t");
			if (n == 42)
				li.add(40);
			if (n == 77)
				li.set(48);
		}
		
		
		System.out.println("Number List is " + slots);
		
		
		Collections.sort(slots);
		System.out.println("Number List in Ascending order is " + slots);
		
		Collections.reverse(slots);
		System.out.println("Number List in Descending order is " + slots);

	}

}
