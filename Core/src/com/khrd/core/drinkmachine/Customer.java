package com.khrd.core.drinkmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	private Money myMoney;
	private List<Drink> myBag;
	private Scanner scan; 
	
	public Customer(int money) {
		
		myMoney = new Money();
		myMoney.add(money);
		myBag = new ArrayList();
		scan = new Scanner(System.in);
	}
	
	public void purchase(DrinkMachine dm) {
		while(true) {
			dm.showDrinks();
			System.out.print("구매하려는 제품 번호를 입력해 주세요 (0: 종료) : ");
			int no = scan.nextInt();			
			if(no == 0) { break; }
			
			Drink drink = dm.choiceDrink(no);
			
			if(drink == null) {				
				continue;
			} else {
				myBag.add(drink);
			}			
		}
	}
}













