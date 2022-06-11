package ch05;

import java.util.Arrays;

public class Test5_5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		
		//배열 arr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i < arr.length; i++) {
			int j =  (int)(Math.random()*arr.length);
			int tem = 0;
			
			tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
		}
		
		//배열 arr의 앞에서 3개수를 배열 arr2에 복사한다
//		System.arraycopy(arr, 0, arr2, 0, 3); or ↓
		arr2 = Arrays.copyOf(arr, 3);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	
	} 

}
