package javalogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Practice_230926 {

	public static void main(String[] args) throws Exception {
		// n: 몇 개의 가게(1~1,000), m: 몇 개월 간 영업(1~12)
		// a: 건설비용(1~10,000) b: 인건비(1~10,000) c: 라멘 한 그릇 당 이익(1~500)
		// r: 몇 그릇 팔았는지(1~1,200)
		// 마이너스 난 가게가 몇 개?
		
		BufferedReader br; 
		StringTokenizer st;
		int check = 0;
	

		do {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
			
			try {
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				
				if(n<1 || n>1000 || m<1 || m>12) {
					check = 1;
					System.out.println("1~1000의 점포수, 1~12개월의 개월수로 입력");
				}else {
						
					do {	
						br = new BufferedReader(new InputStreamReader(System.in));
						st = new StringTokenizer(br.readLine());
						
						try {
							int a = Integer.parseInt(st.nextToken());
							int b = Integer.parseInt(st.nextToken());
							int c = Integer.parseInt(st.nextToken());
							
							if(a<1 || a>10000 || b<1 || b>10000 || c<1 || c>500) {
								check = 2;
								System.out.println("건설비용 1~10000, 인건비 1~10000, 이익 1~500으로 다시 입력하세요");
							}else {
								br = new BufferedReader(new InputStreamReader(System.in));
								//st = new StringTokenizer(br.readLine());
								
								int count = 0;
								int i = 0;
								while(i<n) {
									int r = Integer.parseInt(br.readLine());
									
									if(r<1 || r>1200) {
										System.out.println("1~1200사이의 정수로 다시 입력하세요");
									}else {
										int profit = (c*r)-a-(b*m);
										if(profit < 0) count++;
										i++;
									}
									
									if(i>=n) break;
								}
									
								System.out.println("폐점할 가게: "+count);
									
							}
							
						}catch(Exception e) {
							check = 2;
							System.out.println("건설비용 1~10000, 인건비 1~10000, 이익 1~500으로 다시 입력하세요");
						}
					}while(check == 2);	
						
				}
				
				
			}catch(NumberFormatException e) {
				check = 1;
				System.out.println("2개의 정수로 다시 입력하세요");
			}catch(NoSuchElementException e) {
				check = 1;
				System.out.println("2개의 정수로 다시 입력하세요");
			}
			
		}while(check == 1);
		
		
		
	}

}
