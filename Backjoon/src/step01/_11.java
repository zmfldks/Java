package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/8/19
 * 이름 : 이왕근
 * 내용 : 백준 1단계 11번 문제, 나머지
 * 
 */
public class _11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
	}

}
