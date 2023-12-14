package com.sapient.util;


public class GetConnection {
	public String getConnection(String dbName) {
		
		if(dbName.equals("mysql")) {
			// write MySQL BL 
		}else if(dbName.equals("mongodb")) {
			// write MongoDB BL 
		}
		return  "Connecting to " + dbName; 
	}
}
