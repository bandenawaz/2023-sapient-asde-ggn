package com.naveen;

public class TestingException {
	
	public void checkName(String company) throws Exception {
		if(company.length()<6) {
			throw new Exception("company name small");
		}
		
	}
	
	public void checkSalary(int salary, String company) throws Exception  {
		try {
			checkName(company);
			if(salary<20000) {
				throw new Exception("Sorry salary too low"); 
			}
		}catch(Exception e) {
			throw new Exception("Could not process request", e); 
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			new TestingException().checkSalary(1000, "Sapient");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
