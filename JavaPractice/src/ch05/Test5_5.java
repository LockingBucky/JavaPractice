package ch05;

import java.util.Arrays;

public class Test5_5 {

	public static void main(String[] args) {
		// �迭�� 1~9 �ʱ�ȭ, ���̰� 5�� int�迭�� ����
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[3];
		
		//1~9�ǹ迭�� ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i = 0; i < arr.length; i++) {
			int j =  (int)(Math.random()*arr.length);
			int tem = 0;
			
			tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
		}
		
		//���ڰ� ���� �迭�� �տ��� 3������ �ٸ� int �迭�� �����Ѵ�
		arr2 = Arrays.copyOf(arr, 3);
		
		// ������ �迭�� ���
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	
	} 

}
