package ch06;

public class Test6_3 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "È«±æµ¿";
		s.ban = 1 ;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.jpn = 76;
		
		System.out.println("ÀÌ¸§: "+s.name);
		System.out.println("ÃÑÁ¡: "+s.getTotal());
		System.out.println("Æò±Õ; "+s.getAverage());
	}

}

class Student1{
	String name=null;
	int ban;
	int no;
	int kor;
	int eng;
	int jpn;
	
	Student1 () {}
	
	public int getTotal(){
		int total = this.kor+this.eng+this.jpn;
		return total;
	}
	
	public float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}
}