package Ch05;
/*
 * 날짜 : 2022/09/22
 * 이름 : 이왕근
 * 내용 : 학생 이름과 주소 출력하는 메서드 만들기
 */
public class P132 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
