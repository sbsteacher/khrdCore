package com.khrd.core.drinkmachine;

public class Money {
	private int money;
	
	public void add(int money) {
		this.money += money;
	}
	
	public boolean minus(int money) {
		if(this.money < money) {
			return false;
		}
		this.money -= money;
		return true;
	}
}
