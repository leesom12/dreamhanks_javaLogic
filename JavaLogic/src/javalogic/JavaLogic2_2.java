package javalogic;

import java.util.Scanner;

public class JavaLogic2_2 {

	public static void main(String[] args) {
		int a =0;
		
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("xの値を入力してください。");
				String s_x = sc.next();
				int x = Integer.parseInt(s_x);
				a=0;
				
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
			}catch(NumberFormatException e) {
				a=1;
				System.out.println("xを数字で入力してください。");
			}
		}while(a==1);
	}

}
