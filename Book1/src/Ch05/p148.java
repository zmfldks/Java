package Ch05;
/*
 * 날짜 : 2022/09/22
 * 이름 : 이왕근
 * 내용 : 인스턴스 여러 개 생성하기
 */
public class p148 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
}
