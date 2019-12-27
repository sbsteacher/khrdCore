package com.khrd.core.drinkmachine;

public class Main {
	public static void main(String[] args) {
		DrinkMachine dm = new DrinkMachine();
		Customer cust = new Customer(10_000);
		cust.purchase(dm);
		cust.showMyDrinks();
		//dm.showDrinks();
	}
}
