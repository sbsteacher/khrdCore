package com.khrd.core;

public class Gugudan {
	public static void main(String[] args) {
		GugudanObj obj = new GugudanObj();
		obj.printGugudanRandom(5);
	}
}

class GugudanObj {
	public void printGugudan(int num) {
		printGugudan(num, "\n");
	}
	public void printGugudan(int num, String ln) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d %s", num, i, (num*i), ln);
		}
		System.out.println();
	}
	
	public void printGugudanRandom(int cnt) {
		for(int i=0; i<cnt; i++) {
			int r = getRnum(2, 9);
			printGugudan(r, "\t");
		}
	}
	
	public int getRnum(int last) {
		return getRnum(0, last);
	}
	
	public int getRnum(int first, int last) {
		int calcLast = last - first + 1;
		int r = (int)(Math.random() * calcLast) + first; 
		return r;
	}
}

//GugudanObj 하는 클래스를 Gugudan.java 파일에 정의해 주시구요.
//그 클래스는 printGugudan 이라고 하는 메소드가 있구요.
//파라미터는 정수값 1개를 받습니다. 
//받은 정수값의 구구단을 찍는 메소드입니다. 
//예를 들어 5를 보내면 
//5 * 1 = 5
//5 * 2 = 10
//....
//5 * 9 = 45
//찍는 메소드를 만들어 주시고
//메인메소드에서 printGugudan 메소드를 호출해 주세요!!!!

//printGugudanAll
//저 메소드 호출하면 2~9단까지 구구단을 출력할껀데
//2 * 1 = 2 \t 3 * 1 = 3 .... 9 * 1 = 9
//2 * 2 = 4 \t 3 * 2 = 6 ....
//....

//printGugudanRandom
//정수값1개를 받는다.
//그 정수값만큼 랜덤한 구구단(2~9)을 출력한다.
//ex)3 을 보내면 랜덤한 구구단 3개를 출력!








