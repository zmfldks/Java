package Ch04;
/*
 * 날짜 : 2022/09/20
 * 이름 : 이왕근
 * 내용 : continue문 문제
 */
public class P119 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
				continue;
			total += num;
		}
		System.out.println("1부터 100까지의 홀수 합은 : " + total + "입니다." );
	}
}
