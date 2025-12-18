package com.tnsif.oopsconcepts;

public class EncapsulationDemo {
	
	private String name;
	private int accountNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "encapsulation demo"+name+accountNo;
	}

}