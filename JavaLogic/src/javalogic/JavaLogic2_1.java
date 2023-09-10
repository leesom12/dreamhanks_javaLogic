package javalogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaLogic2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x의 값을 입력하세요");
		try {
			int x = Integer.parseInt(br.readLine());
			System.out.println(x);
		} catch (NumberFormatException e) {	
			System.out.println("");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println("x의 값을 입력하세요");
//		int x = sc.nextInt();
//		
//		System.out.println("y의 값을 입력하세요");
//		int y = sc.nextInt();
//		
//		if(x>y) System.out.println("x는 y보다 크다");
//		else if(x<y) System.out.println("x가 y보다 작다");
//		else System.out.println("x와 y의 값이 같다");

	}

}
