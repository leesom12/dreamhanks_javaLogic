package javalogic;

import java.util.Random;

public class JavaLogic15 {

	public static void main(String[] args) {
		// 2から100の乱数を発生させ、その数を素因数分解するプログラムを作成しなさい。
		
		Random random = new Random();
		int max = 100;
		int min = 2;
		
		int num = random.nextInt(max-min)+min;
		//int num = 72;
		
		System.out.print(num+"= ");
		for(int i=2; i<=num; i++) {
			while(num%i==0) {
				System.out.print(i+"*");
				num/=i;
			}
		}
		
	}

}
