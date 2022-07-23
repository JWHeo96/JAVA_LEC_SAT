/*
 * 생성자 (Constructor)
 * 
 * 클래스명 (매개변수...) {
 * 		초기화 실행문
 * 		...
 * }
 * 
 */

class Student {
	
	String name;
	int grade;
	String gender;
	
	//-- 생성자 메서드  선언
	public Student() {
		name = "허장욱";
		grade = 6;
		gender = "남성";
	}
	
	public Student(String p_name, int p_grade, String p_gender) {
		name = p_name;
		grade = p_grade;
		gender = p_gender;
	}
	
	void sayName() {
		System.out.println("이름은 '" + name + "' 입니다.");
	}
	void sayGrade() {
		System.out.println("학년은 '" + grade + "' 학년 이에요.");
	}
	
}

public class ConstructExample {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.sayName();
		std.sayGrade();
		
		Student std2 = new Student("김현지", 3, "여성");
		std2.sayName();
		std2.sayGrade();
		
	}
	
}
