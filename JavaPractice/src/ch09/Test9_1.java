package ch09;

public class Test9_1 {
	public static void main(String[] args) {
		Value v = new Value(8);
		Value s = new Value(8);
		
		if (v.eqs(s)) {
// v.equals(s)�� �Էµ� value ���� �ƴ� �ּҷ� ���⶧���� �ٸ��ٰ� ���´�.
			System.out.println("����!"); 
		} else {
			System.out.println("�ٸ���!");
		}
	}
}
// �׷�, ��� value�� ���� ���ϵ��� �����?
class Value {
	int value;
	
	Value(){} //�ʱ�ȭ ������
	
	Value(int value){
		this.value = value;
	}
	public boolean eqs (Object obj) {
		if(!(obj instanceof Value)) {return false;}
		Value d = (Value) obj;
		
		return this.value == d.value;
	}
}
