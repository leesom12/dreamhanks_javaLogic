package javalogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class JavaLogic11 {

	public static void main(String[] args) throws Exception {
		//４つの整数をコンソールに入力して、４つの値のうち３番目に大きい値をコンソール表示するプログラムを作ってください。
		
		BufferedReader br;
		StringTokenizer st;
		int check = 0;				//エラーが発生した時チェックするための値
		int array [] = new int[4];	//4つの数字を入力する配列
		
		do{
			br =  new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
			
			try {
				for(int i=0; i<array.length; i++) {
					array[i] = Integer.parseInt(st.nextToken());	//4回繰り返し配列に数字を入れる
				}
				
				for(int i=0; i<array.length; i++) {
					for(int j=i+1; j<array.length; j++) {		//i番目とこれより後ろの配列を比較
						if(array[i] > array[j]) {
							int a = array[i];
							array[i] = array[j];	//前の数が後の数より大きい場合は順番を変える
							array[j] = a;
						}
					}
				}
				
				System.out.println("３番目に大きい値:   "+array[2]);
				
			}catch(NumberFormatException e) {
				System.out.println("４つの整数を入力してください");	
				check = 1;			//数字なくて文字が入って来た時再入力してもらえるようにcheckを１に変える
			}catch(NoSuchElementException e) {
				System.out.println("４つの整数を入力してください");
				check = 1;			//２つより少ない数が入って来た時再入力してもらえるようにcheckを１に変える
			}
			
		}while(check == 1);		//checkが１なら反復
		

	}

}
