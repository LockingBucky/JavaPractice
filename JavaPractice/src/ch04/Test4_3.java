package ch04;

public class Test4_3 {

	public static void main(String[] args) {
		int sum =0;
		int total = 0;
		
		int i = 1;
		while (i <= 10) {
			sum += i;
			total += sum;
			i++;
		}
		System.out.println(total);
	}

}
