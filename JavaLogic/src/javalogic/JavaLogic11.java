package javalogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaLogic11 {

	public static void main(String[] args) throws Exception {
		//４つの整数をコンソールに入力して、４つの値のうち３番目に大きい値をコンソール表示するプログラムを作ってください。
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("４つの整数を入力してください");
		StringTokenizer st;
		int check = 0;
		int array [] = new int[4];
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			try {
				for(int i=0; i<array.length; i++) {
					array[i] = Integer.parseInt(st.nextToken());
				}
			}catch(NumberFormatException e) {
				System.out.println("整数を入力してください");
				check = 1;
			}
			
			if(check == 0) break;
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}
		
		System.out.println("３番目に大きい値:   "+array[2]);

	}

}
