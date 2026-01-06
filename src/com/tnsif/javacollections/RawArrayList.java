package com.tnsif.javacollections;

import java. util. ArrayList;
import java.util.List;
import java.util.Iterator;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List aslotsType = new ArrayList();
		aslotsType . add(1);
		aslotsType . add("heslotso");
		aslotsType . add(2);
		aslotsType . add("world");
		aslotsType . add(true);
		
		System.out.println(aslotsType);
		System.out.println(aslotsType.get(3));
		//int x = (int) aslotsType.get(1);  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		
		ArrayList <Object> objectList = new ArrayList <> ();
		objectList.add(391);
		objectList.add("reaper");
		objectList.add(false);
		System.out.println(objectList);
		System.out.println(objectList.get(2));
		
		/*ArrayList <String> names = new ArrayList <> ();
		Iterator<String> itr = names.iterator();
		names . add("1");
		names . add("heslotso");
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
