package sub8;
/*
 * 날짜 : 2022/09/29
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */

@FunctionalInterface
interface NumericLambda{
	boolean test(int n);
}

public class Test05 {
	public static void main(String[] args) {
		
		NumericLambda isEven =
				
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		NumericLambda isNonNeg =
				
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}
	}
}
