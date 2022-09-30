package Ch05;
/*
 * 날짜 : 2022/09/22
 * 이름 : 이왕근
 * 내용 : StudentTest 실행 클래스 만들기
 */
public class p146 {
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
