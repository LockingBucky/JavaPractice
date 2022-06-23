package ch09;

public class Test9_1 {
	public static void main(String[] args) {
		Value v = new Value(8);
		Value s = new Value(8);
		
		if (v.eqs(s)) {
// v.equals(s)는 입력된 value 갑이 아닌 주소로 보기때문에 다르다고 나온다.
			System.out.println("같다!"); 
		} else {
			System.out.println("다르다!");
		}
	}
}
// 그럼, 어떻게 value의 값을 비교하도록 만들까?
class Value {
	int value;
	
	Value(){} //초기화 생성자
	
	Value(int value){
		this.value = value;
	}
	public boolean eqs (Object obj) {
		if(!(obj instanceof Value)) {return false;}
		Value d = (Value) obj;
		
		return this.value == d.value;
	}
}
