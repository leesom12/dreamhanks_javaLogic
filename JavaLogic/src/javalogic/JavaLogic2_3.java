package javalogic;

import java.util.Scanner;

public class JavaLogic2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("月を入力してください");
		int month = sc.nextInt();
		String day = "";
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: day="31日";
				break;
			case 2: day="28일";
				break;
			case 4:case 6:case 9:case 11: day="30日";
				break;
			default: day="入力が間違っています。";
		}
		
		System.out.println(day);
	}

}
