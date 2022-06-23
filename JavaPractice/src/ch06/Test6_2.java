package ch06;

public class Test6_2 {

	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);
		String str = s.info();
		System.out.println(str);
	}

}

class Student {
	String name = null;
	int grade = 0;
	int number = 0;
	int kor = 0;
	int eng = 0;
	int jpn = 0;
	
	Student(String name, int grade, int number, int kor, int eng, int jpn){
		this.name = name;
		this.grade = grade;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.jpn = jpn;
	}
	
	public String info() {
		return name+","+grade+","+number+","+kor+","+eng+","+jpn+","+(kor+eng+jpn)+","+
				((int)((kor+eng+jpn)/3f*10+0.5f)/10f);
	}
	
}

//class Student {
//	String d;
//	int classroom;
//	int grade;
//	int math;
//	int eng;
//	int jpn;
//	
//	Student (String d, int classroom, int grade, int math, int eng, int jpn){
//		this.d = d; this.classroom = classroom; this.grade = grade; this.math = math; this.eng = eng; this.jpn = jpn;
//	}
//	
//	public String info() {
//		return classroom
//				+","+classroom
//				+","+grade
//				+","+math
//				+","+eng
//				+","+jpn
//				+","+(math+eng+jpn)
//				+","+((int)((math+eng+jpn) / 3f * 10 + 0.5f) / 10f)
//				;
//		
//	}
//}