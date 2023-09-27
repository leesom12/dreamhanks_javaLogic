package javalogic;

public class JavaLogic16 {

	public static void main(String[] args) {
		// a,b,cを、いずれも1以上100以下の整数とするとき、
		// a*a+b*b=c*cを満たす、全てのa,b,cの組み合わせ全てと、その数を求め、画面に表示しなさい。
		
		for(int a=1; a<=100; a++) {
			for(int b=a+1; b<=100; b++) {
				for(int c=1; c<=100; c++) {
					if(c*c == (a*a)+(b*b)) {
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}

}
