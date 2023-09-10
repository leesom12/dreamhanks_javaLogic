package javalogic;

public class JavaLogic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for(int i=0;i<=8;i++) {
				if(i<5) {
					for(int j=4; j>i; j--) {
						System.out.print(" ");
					}
					for(int k=0; k<i*2+1; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				else {
					for(int k=1; k<=i-(8/2); k++) {
						System.out.print(" ");
					}
					for(int k=1;k<=(-2*i)+(2*8+1);k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

		
	}

}
