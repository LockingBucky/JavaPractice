package ch05;

import java.util.Arrays;

public class Test5_5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		
		//�迭 arr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i = 0; i < arr.length; i++) {
			int j =  (int)(Math.random()*arr.length);
			int tem = 0;
			
			tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
		}
		
		//�迭 arr�� �տ��� 3������ �迭 arr2�� �����Ѵ�
//		System.arraycopy(arr, 0, arr2, 0, 3); or ��
		arr2 = Arrays.copyOf(arr, 3);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	
	} 

}
