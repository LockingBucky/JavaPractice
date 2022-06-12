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
//        throw new NullPointerException(); // 질문2. System.out.println(1);과 System.out.println(5); 에 컴파일 에러가 발생하는 이유가 무엇인가요?
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);  // 질문1. 실행되지 않는 이유가 무엇인가요?
	}
	
	static void method2() {   // 질문2. throws Exception을 쓰지 않은 이유는 무엇인가요?
		throw new NullPointerException();
	}
}