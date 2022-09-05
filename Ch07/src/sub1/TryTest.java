package sub1;
/*
 * 날짜 : 2022/09/05
 * 이름 : 이왕근
 * 내용 : 예외처리 실습하기
 * 
 * 예외처리(Exception)
 * - 예외는 프로그램 실행중에 발생하는 모든 오류(Error)
 * - 실행중(Run-Time)에 발생하는 오류를 대처하고 안정정인 프로그램 개발을 위해 예외처리 수행
 */
public class TryTest {
	public static void main(String[] args) {
		
		// 예외상황1 : 어떤 수를 0으로 나눌때 
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0, rs2 = 0, rs3 = 0, rs4 = 0;
		
		try {
			// 예외가 발생할 가능성이 있는 코드 로직
			 rs1 = num1 + num2;
			 rs2 = num1 - num2;
			 rs3 = num1 * num2;
			 rs4 = num1 / num2;
		
		}catch(ArithmeticException e) {
			// 예외가 발생했을 때 처리할 코드 로직
			e.printStackTrace();
		}
		
		
		
		System.out.println("rs1 :"+rs1);
		System.out.println("rs2 :"+rs2);
		System.out.println("rs3 :"+rs3);
		System.out.println("rs4 :"+rs4);
		
		// 예외상황2 : 배열의 인덱스 범위를 벗어났을 때
		
		int[]array = {1,2,3,4,5};
		
		try {
			for(int i=0; i<=5; i++) {
				
				System.out.println(array[i]+" ");
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		System.out.println();
		
		
		
		// 예외상황3 : Null 포인트 참조 에러
		Animal a = null;
		
		try {
			a.move();
			a.hunt();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}

		
		
		
		// 예외상황4 : 캐스팅 에러 
		
		Animal a1 = new Tiger();// 업캐스팅(다형성)
		Animal a2 = new Eagle();// 업캐스팅(다형성)
		
				
		try {
			// 예외발생 코드
			Eagle eagle = (Eagle) a1; //다운캐스팅
			eagle.move();
			eagle.hunt();
			
		}catch(ClassCastException e) {
			// 예외처리 코드
			e.printStackTrace();
			
			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();
		
		}finally {
			// 정리코드
			
			System.gc();// 메모리 정리
			System.out.println("캐스팅 완료...");
		}
		
		
		
		System.out.println("프로그램 종료...");
	}
}
