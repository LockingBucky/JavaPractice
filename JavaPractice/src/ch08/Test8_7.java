package ch08;

import java.util.Scanner;

public class Test8_7 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 101);
		int count = 0;
		int input = 0;
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력주세요!");
			//Scanner sc = new Scanner(System.in);
			//input = sc.nextInt();
			// ▲ input = new Scanner(System.in).nextInt(); 로 바꿀수 있음 
			// try 문에 Scanner 
			try {
				input = new Scanner(System.in).nextInt();
			} catch(Exception e) {
				System.out.println("유효하지 않는 값입니다. 다시값을 입력주세요!");
				continue;
			}
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요!");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요!");
			} 
			else {
				System.out.println("맞췄습니다!"+"숫자는 "+answer+"입니다!");
				System.out.println("총 시도 횟수는 "+count+"번 입니다.");
			    break ;
			}
			
		} while (true);
	}

}
