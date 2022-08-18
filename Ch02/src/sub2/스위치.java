package sub2;

import java.util.Scanner;

/*
 *  날짜 : 2022/08/17
 * 이름 : 이왕근
 * 내용 : 자바 조건문 switch 실습하기
 * 
 */
public class 스위치 {

	public static void main(String[] args) {
		//사용자 입력
		System.out.print("숫자 입력 : ");
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		System.out.println("입력한 숫자 : "+number);
		
		switch(number % 2) {
		
		case 0 :
			System.out.println("number는 짝수 입니다.");
			break;
			
		case 1 :
			System.out.println("number는 홀수 입니다.");
			break;
		
		
		}
	}

}
