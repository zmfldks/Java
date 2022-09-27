package sub6;
/*
 * 날짜 : 2022/09/27
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		pyramid(3);
		pyramid(5);
		pyramid(7);
	}
	
	public static void pyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * i -1; k++)
				System.out.print("*");
			
			System.out.print("\n");
		}
	}
}
