package javalogic;

import java.util.Scanner;

public class JavaLogic2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("xの値を入力してください。");
		int x = sc.nextInt();
		
		if(x>=0) {
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
