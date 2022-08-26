package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/8/19
 * 이름 : 이왕근
 * 내용 : 백준 1단계 6번 문제, 사칙연산
 * 
 */
public class _07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		scanner.close();
		
	}

}
