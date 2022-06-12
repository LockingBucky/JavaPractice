package ch08;
public class Exception_test {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		} catch (Exception e) {
			System.out.println(7);
		}

	}
	
	static void method1() throws Exception {
		try {
			method2();
//        throw new NullPointerException(); // ����2. System.out.println(1);�� System.out.println(5); �� ������ ������ �߻��ϴ� ������ �����ΰ���?
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);  // ����1. ������� �ʴ� ������ �����ΰ���?
	}
	
	static void method2() {   // ����2. throws Exception�� ���� ���� ������ �����ΰ���?
		throw new NullPointerException();
	}
}