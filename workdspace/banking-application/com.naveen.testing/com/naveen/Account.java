package com.naveen;

import java.util.Objects;

public class Account {
	private int accountId; 
	private double accountBalance; 
	private String accountHolderName;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public Account() {}
	
	public Account(int accountId, double accountBalance, String accountHolderName) {
		super();
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountBalance=" + accountBalance + ", accountHolderName="
				+ accountHolderName + "]";
	}
//	@Override
//	public int hashCode() {
//		return this.accountHolderName.charAt(0);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Account temp =  (Account)obj;
//		
//		return 
//				temp.accountId == this.accountId && 
//				temp.accountBalance == this.accountBalance && 
//				temp.accountHolderName.equals(this.accountHolderName); 
//	} 
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(accountBalance, accountHolderName, accountId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(accountBalance) == Double.doubleToLongBits(other.accountBalance)
				&& Objects.equals(accountHolderName, other.accountHolderName) && accountId == other.accountId;
	}
	
	
	
}
