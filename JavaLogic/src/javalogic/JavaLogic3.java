package javalogic;

public class JavaLogic3 {

	public static void main(String[] args) {
		int [] array = {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int a = array[j];
					array[j]= array[i];
					array[i]=a;
				}
			}
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
