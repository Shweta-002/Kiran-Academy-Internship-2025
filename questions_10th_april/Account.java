package com.questions_10th_april;

public class Account {

	private long accountNumber;
	private String accHolName;
	private double initialBalance;
	private double deposite;
	private double withdraw;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
		
	}
	
	public String getAccHolName() {
		return accHolName;
	}
	
	public void setAccHolName(String accHolName) {
		this.accHolName = accHolName;
	}
	
	public double getInitialBalance() {
		return initialBalance;
	}
	
	public void setInitialBalance(double initialBalance) {
		this.initialBalance= initialBalance;
	}
	
	public double gettotalBalance() {
		double total = (initialBalance + deposite) - withdraw;
		return total;
	}
}
