package javalogic;

import java.util.Scanner;

public class JavaLogic8 {

	public static void main(String[] args) {
		//指定した金額を100円玉と10円玉と５円玉と１円玉だけで、できるだけ少ない枚数で支払いたい。
		//金額を入力するとそれぞれの枚数を計算して表示するプログラムを作りなさい。
		
		Scanner sc = new Scanner(System.in);
		System.out.println("金額を入力してください");
		int price = sc.nextInt();
		
		int hund = price/100;
		
		price = price - (hund*100);
		int ten = price/10;
		
		price = price - (ten*10);
		int fiv = price/5;
		
		price = price - (fiv*5);
		int one = price;
		
		System.out.println("100円: "+hund);
		System.out.println("10円:  "+ten);
		System.out.println("5円:  "+fiv);
		System.out.println("1円:  "+one);
	}

}
