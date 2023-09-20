package javalogic;

import java.util.Scanner;

public class JavaLogic9 {

	public static void main(String[] args) {
		//コンソールに入力した数値を２進数に変換してコンソール表示するプログラムを作りなさい。
		//2進数表示１6桁まで対応するものとする
		
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int number = sc.nextInt();
		int a = number;
		String result = "";
		
		while(number>0) {
			result =  number%2+result;
    		number /=2;
		}
		
		System.out.println("10進数:  "+a);
		System.out.println("２進数: "+result);

	}

}
