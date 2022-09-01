package sub1;
/*
 * 날짜 : 2022/08/17
 * 이름 : 이왕근
 * 내용 : 자바 조건문 if 실습하기
 * 
 * 
 */
public class IfTest {
	public static void main(String[] args) {
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			// 조건이 참일때 실행
			System.out.println("num1은 num2보다 작다.");
		}
		
		if(num1 > 1) {
			// 조건이 거짓이라 실행이 되지않고 건너뜀
			System.out.println("num1은 1보다 크다.");
		}
		
		if(num1 > 0) {
			if(num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		
		if(num1 > 0 || num2 > 3) {
			System.out.println("num1은 0보다 크고 또는 num2는 3보다 크다.");
			
		if(num1 > 2 || num2 > 1) {
			System.out.println("num1은 2보다 크고 또는 num2는 1보다 크다.");
		}
		if(num1 > 2 || num2 > 3) {
			System.out.println("num1은 2보다 크고 또는 num2는 3보다 크다.");
		}
		}
	
		}
		
		// if ~ else
		int var1 = 1, var2 = 2;
		
		if(var1 > var2) {
			// 조건이 참일때
			System.out.println("var1은 var2보다 크다");
		}else {
			// 조건이 거짓일때
			System.out.println("var1은 var2보다 작다.");
			
			
		}
		
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
				
		if(n1 > n2) {
			System.out.println("n1은 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2은 n3보다 크다.");
		}else if(n3 > n4) {
			System.out.println("n3은 n4보다 크다.");
		}else{
			System.out.println("n4가 가장 크다.");
			
		}
		
	}
}
