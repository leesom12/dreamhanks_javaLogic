package javalogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class JavaLogic14 {

	public static void main(String[] args) throws Exception {
		// コンソールから2つの整数を入力し、互いに素であるか判定するプログラムを作成しなさい。
		
		BufferedReader br; 
		StringTokenizer st; 
		int check = 0;
		
		while(true) {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
			try {
				int num1= Integer.parseInt(st.nextToken());
				int num2= Integer.parseInt(st.nextToken());
				
				if(num1<0 || num2<0) {
					System.out.println("2つの整数を入力してください");
					check = 1;
				}
				int max = 0;
				for(int i=1; i<=num1 && i<=num2; i++) {
					if(num1%i == 0 && num2%i == 0) {
						max = i;
					}
				}
				
				if(max==1)System.out.println("互いに素です");
				else System.out.println("互いに素じゃないです");
			}catch(NumberFormatException e) {
				System.out.println("2つの整数を入力してください");
				check = 1;
			}catch(NoSuchElementException e) {
				System.out.println("2つの整数を入力してください");
				check = 1;
			}
			
			if(check==0) break;
		}
	}

}
