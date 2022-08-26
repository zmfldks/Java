package step01;

import java.util.Scanner;

public class _12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int b1 = (int)(b / Math.pow(10, 2)) %10;
		int b2 = (int)(b / Math.pow(10, 1)) %10;
		int b3 = (int)(b / Math.pow(10, 0)) %10;
		
		System.out.println(a* b3);
		System.out.println(a* b2);
		System.out.println(a* b1);
		
		System.out.println(a*b);
		
		scanner.close();
	}

}
