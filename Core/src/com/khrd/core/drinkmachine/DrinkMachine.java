package com.khrd.core.drinkmachine;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {
	final int SIZE = 10;
	final String[] names = {"콜라", "환타", "사이다", "비락식혜"};
	final int[] prices = {1400, 1300, 1200, 1000};
	
	private List<Drink> colaArr;
	private List<Drink> fantaArr;
	private List<Drink> ciderArr;
	private List<Drink> ckArr;
	
	private List<List<Drink>> store;
	
	public DrinkMachine() {
		init();
	}
	
	private void init() {
		store = new ArrayList();
		colaArr = new ArrayList();
		fantaArr = new ArrayList();
		ciderArr = new ArrayList();
		ckArr = new ArrayList();
		
		store.add(colaArr);
		store.add(fantaArr);
		store.add(ciderArr);
		store.add(ckArr);
		
		for(int i=0; i<store.size(); i++) {
			List<Drink> target = store.get(i);
			
			for(int z=0; z<SIZE; z++) {
				target.add(new Drink(names[i], prices[i]));
			}
		}
	}
	
	public void showDrinks() {
		System.out.printf("번호    제품명    금액    재고\n");
		for(int i=0; i<store.size(); i++) {
			List<Drink> target = store.get(i);
			System.out.printf("%d.    %s    %,d원    %,dea\n", (i+1), names[i], prices[i], target.size());
		}
	}
}








