package com.naveen;

import java.util.HashSet;
import java.util.Set;

public class AccountSet {
	public static void main(String[] args) {
		Set<Account> set = new HashSet<>(); 
		
		set.add(new Account(101, 2000, "Anupam"));
		set.add(new Account(102, 3000, "Kiran")); 
		set.add(new Account(103, 4000, "Arik")); 
		set.add(new Account(101, 2000, "Anupam")); 
		
		for(Account account: set) {
			System.out.println(account +", hashcode " + account.hashCode());
		}
		
	}
}
