package javalogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice_230922 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(1>n || n>1000) {
			System.out.println("1에서 1000까지의 수로 다시 입력");
			n = Integer.parseInt(br.readLine());
		}
		
		StringTokenizer st;
		int max=0;
		int min=0;
		
		for(int i=0; i<n; i++) {
			int a =0;
			int b =0;
			while(true) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken()); 
				b = Integer.parseInt(st.nextToken());
				
				if(a<1 || a>45000 || b<1 || b>45000) {
					System.out.println("1에서 45000사이의 수로 다시 입력");
				}else {
					break;
				}
			}
			
			for(int j=1; j<=a && j<=b; j++) {
				if(a%j == 0 && b%j == 0) max = j;	//최대공약수
			}
			min = (a*b)/max;	
			max = 0;
			System.out.println(min);
		}
	}

}
