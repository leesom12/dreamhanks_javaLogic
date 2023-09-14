package javalogic;

import java.util.Scanner;

public class JavaLogic2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("xを入力してください。");
			String s_x = sc.next();
		
			try{
				x = Integer.parseInt(s_x);	//入力してもらったs_xの値を数字に変換
				a=0;						//ｘが数字によく変換させたから、aをまた０で初期化
				
			}catch(NumberFormatException e) {
				a = 1;						//数字で変換する過程でエラーが発生した時、aを1に変える。
				System.out.println("xを数字で入力してください。");	
			}
		}while(a==1);						//aが１、つまりcatch文が実行されたら継続反復
		
		do {
			System.out.println("yを入力してください。");
			String s_y = sc.next();
			try{
				y = Integer.parseInt(s_y);	//入力してもらったs_yの値を数字に変換
				b=0;						//ｙが数字によく変換させたから、ｂをまた０で初期化
				
				if(x>y) System.out.println("xはyより大きい。");		//ｘとｙの値が全部数字で入力されたから、結果出力
				else if(x<y) System.out.println("xがyより小さい。");
				else System.out.println("xとyの値が同じだ。");
			}catch(NumberFormatException e) {
				b = 1;						//数字で変換する過程でエラーが発生した時、ｂを1に変える。
				System.out.println("yを数字で入力してください。");
			}
		}while(b==1);	//ｂが１、つまりcatch文が実行されたら継続反復
		

	}

}
