package com.abstraction_18th_april;

public interface ATM {
	
	public static final int initial_balance=2000;
	
	public abstract void withdraw(int amount);
	public abstract void deposite(int amount);

}
