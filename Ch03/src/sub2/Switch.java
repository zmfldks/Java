package sub2;

import java.util.Scanner;

public class Switch {
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
