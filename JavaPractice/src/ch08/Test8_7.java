package ch08;

import java.util.Scanner;

public class Test8_7 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 101);
		int count = 0;
		int input = 0;
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ּ���!");
			//Scanner sc = new Scanner(System.in);
			//input = sc.nextInt();
			// �� input = new Scanner(System.in).nextInt(); �� �ٲܼ� ���� 
			// try ���� Scanner 
			try {
				input = new Scanner(System.in).nextInt();
			} catch(Exception e) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�. �ٽð��� �Է��ּ���!");
				continue;
			}
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���!");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���!");
			} 
			else {
				System.out.println("������ϴ�!"+"���ڴ� "+answer+"�Դϴ�!");
				System.out.println("�� �õ� Ƚ���� "+count+"�� �Դϴ�.");
			    break ;
			}
			
		} while (true);
	}

}
