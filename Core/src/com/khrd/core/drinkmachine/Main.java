package com.khrd.core.drinkmachine;

public class Main {

	public static void main(String[] args) {
		DrinkMachine dm = new DrinkMachine();
		Customer cust = new Customer(10_000);		
		
		//1. 콜라 - 1,400원 (10ea)
		//2. 환타 - 1,200원 (10ea)
		//3. 사이다 - 1,300원 (10ea)
		//4. 비락식혜 - 1,000원 (10ea)
		dm.showDrinks();

	}

}
