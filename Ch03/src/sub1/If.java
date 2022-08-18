package sub1;
/*
 * 날짜 : 2022/08/17
 * 이름 : 이왕근
 * 내용 : 자바 조건문 if 실습하기
 * 
 * 
 */
public class If {
	public static void main(String[] args) {
		//if
		int num1 = 1;
		int num2 = 2;
		
		if(조건식) {
			//조건이 참일때 실행
		
		if(num1 < num2)
			System.out.println("num1은 num2보다 작다.");
	
		if(num1 > 1 ) {
			System.out.println("num1은 1보다 크다.");
		}
		
		if(num1 > 0 ) {
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다");

		디버깅 숫자 앞에 있는 파란색 선 더블클릭 점이 생김 실행 옆에 벌래 표시 스위치 f6눌러서 확인
		우측 상단에 벌래 옆에 있는 거 눌러서 다시 돌아오기
		
		}
		//if ~ else
		int var1 = 1, var2 = 2;
		
		if(조건) {
			// 조건이 참일때
			
		}else {
		//조건이 거짓일때
			
		if(var1 > var2) {
			System.out.println("var1은 var2보다 크다.");
		}else {
			System.out.println("var1은 var2보다 작다");
		}
		
		//if~else if ~else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		if(조건1) {
			
		}else if(조건2) {
			
		}else if(조건3) {
			
		}else {
			
		}
		
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		if(n1 > n2) {
			System.out.println("n1은 n2보다 크다");
		}else if(n2 > n3) {
			System.out.println("n2은 n3보다 크다");
		}else if(n3 > n4) {
			System.out.println("n3은 n4보다 크다");
		}else {
			System.out.println("n4가 가장 크다");
		}
	}
세 개다 참이면 제일 먼저 참인 것만 나오고 끝난다
}
}
