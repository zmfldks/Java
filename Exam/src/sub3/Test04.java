package sub3;
/*
 * 날짜 : 2022/09/02
 * 이름 : 이왕근
 * 내용 : 자바 클래스 연습문제
 */
class Student {
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("=============");
		System.out.println("학번 :"+studentId);
		System.out.println("이름 :"+studentName);
		System.out.println("전공 :"+major);
		System.out.println("학년 :"+grade);
		System.out.println("-------------");
	}
}
public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim =
		kim.studentInfo();
		
		Student lee =
		lee.studentInfo();
		
		Student lim =
		lim.studentInfo();		
	}

}
