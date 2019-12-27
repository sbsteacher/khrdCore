package com.khrd.core.drinkmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
	
	public void showMyMoney() {
		System.out.printf("소유 금액 : %,d\n", myMoney.getMoney());
	}
	
	public void purchase(DrinkMachine dm) {
		while(true) {
			dm.showDrinks();
			showMyMoney();
			
			System.out.print("구매하려는 제품 번호를 입력해 주세요 (0: 종료) : ");
			int no = scan.nextInt();			
			if(no == 0) { break; }
			
			Drink drink = dm.choiceDrink(no, myMoney);
			
			if(drink == null) {				
				continue;
			} else {
				myBag.add(drink);
			}			
		}
	}
	
	public void showMyDrinks() {
		Map<String, Integer> map = new HashMap();
		for(Drink drink : myBag) {
			String nm = drink.getNm();
			if(map.containsKey(nm)) {
				int cnt = map.get(nm);
				map.replace(nm, ++cnt);
			} else {
				map.put(nm, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		int i=0;
		for (Map.Entry<String, Integer> entry : entries) {
			i++;
			System.out.printf("%s (%,d개)", entry.getKey(), entry.getValue());			
			if(i < entries.size()) {
				System.out.print(", ");
			}
		}
		
	}
}













