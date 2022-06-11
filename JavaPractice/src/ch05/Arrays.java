package ch05;

public class Arrays {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] arr2 = new int [3];
		
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random()*arr.length);
			r = arr[i];
			arr[i] = arr[j];
			arr[j] = r;
		}
		arr2 = java.util.Arrays.copyOfRange(arr, 0, 10);
		
		
		for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]);
		}
	} 
}
