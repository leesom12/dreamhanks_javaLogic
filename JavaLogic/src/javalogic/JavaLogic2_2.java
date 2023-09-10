package javalogic;

import java.util.Scanner;

public class JavaLogic2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("xの値を入力してください。");
		int x = sc.nextInt();
		
		//正の数/負の数区分
		if(x>=0) {
			//2で割ったとき、残りが0なら偶数、1なら奇数
			if(x%2==0) {
				System.out.println("正の数の偶数");
			}
			else {
				System.out.println("正の数の奇数");
			}
		}else {
			if(x%2==0) {
				System.out.println("負の数の偶数");
			}
			else {
				System.out.println("負の数の奇数");
			}
		}

	}

}
