package sub1;
import java.util.Scanner;
/*
 * 날짜 : 2022/8/19
 * 이름 : 이왕근
 * 내용 : 자바 자료형 연습문제
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		char grade;
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		if(score >= 90 && score <=100) {
			grade = 'A';
		}else if(score < 90 && score >= 80) {
			grade = 'b';
		}else if(score < 80 && score >= 70) {
			grade = 'C';
		}else if(score < 70 && score >= 60) {
			grade = 'D';
		}else {
			grade = 'f';
		}
		System.out.printf("등급은 %c입니다.", grade);
	}

}
