package javalogic;

public class JavaLogic3 {

	public static void main(String[] args) {
		int [] array = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		//配列のn番目の数とn+1番目の数の大小を比較
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1;j<array.length;j++) {
				//n 番目の数が n+1 番目の数より大きい場合は、2 つの数の順序を変える
				if(array[i]>array[j]) {
					int a = array[j];
					array[j]= array[i];
					array[i]=a;
				}
			}
		}
		
		//配列を出力
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
	}

}
