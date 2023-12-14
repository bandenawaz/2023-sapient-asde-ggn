package com.naveen;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); 
		
		set.add(100);
		set.add(100); 
		set.add(100); 
		set.add(100); 
		set.add(100); 
		
		System.out.println(set.size());
	}
}
