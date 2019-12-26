package com.khrd.core.drinkmachine;

public class Drink {
	private String nm;
	private int price;
	
	public Drink(String nm, int price) {
		super();
		this.nm = nm;
		this.price = price;
	}

	public String getNm() {
		return nm;
	}
	
	public int getPrice() {
		return price;
	}
	
}
