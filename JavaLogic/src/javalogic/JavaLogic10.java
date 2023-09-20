package javalogic;

import java.util.Random;
import java.util.Scanner;

public class JavaLogic10 {

	public static void main(String[] args) {
		//コンピュータに0~99までの乱数（正解値）を発生させて、プレイヤーは値をコンソールに入力して
		//正解値と一致したら、その値と何回で正解したかをコンソールに表示する。
		//一致しなければ、正解値が入力値よりも大きいか小さいかを表示する数字当てゲームを作成しなさい。
		
		Random random = new Random();
		int randomVal = random.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			
			System.out.println("値を入力してください");
			int val = sc.nextInt();
			
			if(randomVal>val) {
				System.out.println("正解値より小さいです");
				count++;
			}else if(randomVal<val) {
				System.out.println("正解値より大きいです");
				count++;
			}else if(randomVal == val) {
				System.out.println("正解です");
				System.out.println(count+"度で正解を当てました");
				break;
			}
		}
		
	}

}
