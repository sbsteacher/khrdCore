package com.khrd.core.drinkmachine;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private Money myMoney;
	private List<Drink> myBag;
	
	public Customer(int money) {
		myMoney = new Money();
		myMoney.add(money);
		myBag = new ArrayList();
	}
}
