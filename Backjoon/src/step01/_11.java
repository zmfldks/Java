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
		
		String one = sc.nextLine();
		String two = sc.nextLine();
		
		int t1 = Integer.parseInt(two.substring(2));
		int t10 = Integer.parseInt(two.substring(1,2));
		int t100 = Integer.parseInt(two.substring(0,1));
		
		int o = Integer.parseInt(one);
		
		System.out.println(o*t1);
		System.out.println(o*t10);
		System.out.println(o*t100);
		System.out.println(((o*t100)*100)+((o*t10)*10)+(o*t1));
	}

}
