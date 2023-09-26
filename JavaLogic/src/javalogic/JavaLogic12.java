package javalogic;

public class JavaLogic12 {

	public static void main(String[] args) {
		// 最初の50個のフィボナッチ数列のリストを計算する関数を記述せよ。
		// フェボナッチ数列がわからない方はヒントをご覧ください。
		
		int array[] = new int[50];
		array[0] = 0;
		array[1] = 1;
		
		for(int i=0; i<array.length; i++) {
			if(i>1) array[i] = array[i-2] + array[i-1];
			System.out.print(array[i]+", ");
		}
		

	}

}
