package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/8/19
 * 이름 : 이왕근
 * 내용 : 백준 1단계 8번 문제, 1998년생인 내가 태국에서는 2541년생?!
 */
public class _09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int gen = scanner.nextInt();
		System.out.println(gen - 543);
		scanner.close();
		
	}

}
