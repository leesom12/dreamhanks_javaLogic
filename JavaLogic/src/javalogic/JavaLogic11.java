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
		int check = 0;
		int array [] = new int[4];
		
		do{
			br =  new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
			
			try {
				for(int i=0; i<array.length; i++) {
					array[i] = Integer.parseInt(st.nextToken());
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
				
			}catch(NumberFormatException e) {
				System.out.println("４つの整数を入力してください");
				check = 1;
			}catch(NoSuchElementException e) {
				System.out.println("４つの整数を入力してください");
				check = 1;
			}
			
		}while(check == 1);
		

	}

}
