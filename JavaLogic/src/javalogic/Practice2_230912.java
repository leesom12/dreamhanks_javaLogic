package javalogic;

public class Practice2_230912 {

	public static void main(String[] args) {
		//이중배열
		int [][] arr= new int[5][5];
		
		int a = 1;
		int col_tot = 0;
		int row_tot = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i<arr.length-1) {
				for(int j=0; j<arr[i].length; j++) {
					if(j<arr[i].length-1) {
						arr[i][j] = a;
						a++;
						
						col_tot += arr[i][j];
					}
				}
				arr[i][4] = col_tot;
				col_tot = 0;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				row_tot+= arr[j][i];
			}
			arr[4][i]= row_tot;
			row_tot=0; 
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
