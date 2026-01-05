package com.tnsif.javacollections;

import java. util. ArrayList;
import java.util.List;
import java.util.Iterator;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List allType = new ArrayList();
		allType . add(1);
		allType . add("hello");
		allType . add(2);
		allType . add("world");
		allType . add(true);
		
		System.out.println(allType);
		System.out.println(allType.get(3));
		//int x = (int) allType.get(1);  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		
		ArrayList <Object> objectList = new ArrayList();
		objectList.add(391);
		objectList.add("reaper");
		objectList.add(false);
		System.out.println(objectList);
		System.out.println(objectList.get(2));
		
		/*ArrayList <String> names = new ArrayList <> ();
		Iterator<String> itr = names.iterator();
		names . add("1");
		names . add("hello");
		names . add("2");
		names. add("world");
		names. add("true");

		while (itr.hasNext()) {              
		    String name = itr.next();
		    if (name.equals("true")) {
		        itr.remove();
		    }
		}
		System.out.println(names);*/

		
	}

}
