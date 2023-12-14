package com.naveen;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>(2, 5);  
		System.out.println("Size : " +list.size());
		System.out.println("Capacity " + list.capacity());
		list.add(123);
		list.add(123);
		 
		list.add(123);

		System.out.println("Size : " +list.size());
		System.out.println("Capacity " + list.capacity());

		
		
	}
}
