package javalogic;

import java.util.Scanner;

public class JavaLogic5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字１入力");
		int num1 = sc.nextInt();
		System.out.println("数字２入力");
		int num2 = sc.nextInt();
		
		//最大公約数
		int max = 0; 
		
		//二つの数をiという数で割った時、残りが全て０になる数の中で最も大きい数が最大公約数である。
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1%i == 0 && num2%i == 0) {
				max = i;
			}
		}
		
		//最小公倍数
		int min = (num1*num2)/max;
		
		System.out.println("最大公約数: "+max);
		System.out.println("最小公倍数: "+min);

	}

}
