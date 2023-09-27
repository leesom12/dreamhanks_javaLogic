package javalogic;

public class JavaLogic13 {

	public static void main(String[] args) {
		// 下記の１５段までのパスカル三角形をコンソールに表示するプログラムを作成しなさい。
		// コンソール表示する際に値と値の間はスペースやカンマなどで区切るように表示してください。
		
		int [][] arr = new int [15][15];
		arr[0][0] = 1;

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				if(i==j) arr[i][j] = 1;		//j=iなら最終の値だから１
				else if(j==0) arr[i][j] = 1;	//j=0なら一番前の値だから１
				else arr[i][j] = arr[i-1][j-1]+arr[i-1][j];	//真上の値と左上の値を足す
				
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(arr[i][j]+"  ");
//			}
//			System.out.println();
//		}
	}

}
