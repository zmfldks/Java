package Ch03;
/*
 * 날짜 : 2022/09/20
 * 이름 : 이왕근
 * 내용 : 연습문제
 */
public class P88 {
	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge)? 'T': 'F';
		
		System.out.println(ch);
	}
}
