package com.naveen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapExample {
	public static void main(String[] args) {
		Map<String, Account> map = new HashMap<>(); 
		
		map.put("soumya", new Account(123, 1122, "soumya"));
		map.put("ritesh", new Account(22, 2222, "ritest"));
		map.put("soumya", new Account(100, 1122, "harish"));
		
		
		Iterator<Entry<String, Account>> iterator = map.entrySet().iterator();  

		while(iterator.hasNext()) {
			Entry<String, Account> next = iterator.next();
			
			System.out.println("Key is " + next.getKey() 
				+" Value " + next.getValue().getAccountHolderName().toUpperCase());
		}
	
	

	}
}
