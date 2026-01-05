package com.tnsif.javacollections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> Entry = new ArrayList <> ();
		
		Entry.add(1);
		Entry.add(2);
		Entry.add(3);
		Entry.add(4);
		Entry.add(5);
		
		System.out.println("array list Entry contains : " + Entry);
		
		Entry.add(6);
		Entry.add(7);
		//Entry.add("world"); Generics - compile time notified
		System.out.println("array list Entry contains : " + Entry);
		System.out.println("array list Entry's size : " + Entry.size());
		Entry.remove(Entry.indexOf(6));
		System.out.println("array list Entry after removed 6 : " + Entry);
		
		System.out.println("Does array list Entry contains 729? : " + Entry.contains(729));
		System.out.println("Element in array list Entry's Index 5 : " + Entry.get(5));
		Entry.set(1, 12);
		System.out.println("array list Entry after changing ele 2 to 12 : " + Entry);
		
		for(int i = 0 ; i < Entry.size() ; i++) {
			System.out.println(Entry.get(i));
		}
		
	}

}
