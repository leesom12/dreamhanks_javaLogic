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
				
				if(num1<0 || num2<0) {	//整数かチェック
					System.out.println("2つの整数を入力してください");
					check = 1;
				}
				
				int max = 0;
				for(int i=1; i<=num1 && i<=num2; i++) {
					if(num1%i == 0 && num2%i == 0) {		//2つの数を分けることができる数が公約数
						max = i;
					}
				}
				
				if(max==1)System.out.println("互いに素です");	//最大公約数が１なら互いに素
				else System.out.println("互いに素じゃないです");	//それより大きい数なら互いに素じゃない
			}catch(NumberFormatException e) {
				System.out.println("2つの整数を入力してください");
				check = 1;		//数字なくて文字が入って来た時再入力してもらえるようにcheckを１に変える
			}catch(NoSuchElementException e) {
				System.out.println("2つの整数を入力してください");
				check = 1;		//２つより少ない数が入って来た時再入力してもらえるようにcheckを１に変える
			}
			
			if(check==0) break;	//checkが０ならストップ
		}
	}

}
