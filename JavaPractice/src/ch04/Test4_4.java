package ch04;

public class Test4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int j = 1;
		int num = 0;
		
		for (int i = 1; sum < 100; i++, j = -j) {
			num = i * j;
			sum += num;
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
