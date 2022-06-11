package ch05;

import java.util.Arrays;

public class Test5_5 {

	public static void main(String[] args) {
		// 배열을 1~9 초기화, 길이가 5인 int배열을 생성
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		
		//1~9의배열에 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i < arr.length; i++) {
			int j =  (int)(Math.random()*arr.length);
			int tem = 0;
			
			tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
		}
		
		//숫자가 섞인 배열의 앞에서 3개수를 다른 int 배열에 복사한다
		arr2 = Arrays.copyOf(arr, 3);
		
		// 복가한 배열을 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	
	} 

}
