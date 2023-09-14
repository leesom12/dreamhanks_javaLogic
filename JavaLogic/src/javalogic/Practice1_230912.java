package javalogic;

public class Practice1_230912 {

	public static void main(String[] args) {
		int [][] arr= new int[5][5];
		
		int a = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = a;
				a++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1;j++) {
				arr[i][4] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
