package sub3;
/*
 * 날짜 : 2022/08/17
 * 이름 : 이왕근
 * 내용 : 자바 조건문 for 실습하기
 * 
 */
public class For {
	public static void main(String[] args) {
		// for
				for(int i = 1; i <= 5; i++) {
					System.out.println("i : "+i);					
				}
				
				
				//1부터 10까지 합
				int sum = 0;
				
				for(int k =1 ; k<=10 ; k++) {
					sum += k;
					
				}
				
				System.out.println("1부터 10까지 합 : "+sum);
				
				
				//1부터 10까지 짝수합
				int tot = 0;
				
				for(int k=1; k<=10; k++) {
					if(k가 짝수이면 k % 2 == 0) {
						tot += k;
					}
				}
				
				System.out.println("1부터 10까지 짝수합 : "+tot);
				
				//중첩 for 
				for(int a=1; a<=3 ; a++) {
					
					System.out.println("a : "+a);
					
					for(int b=1; b<5; b++) {
						System.out.println("b : "+b);
						3*5 = 15 디버깅을 함
								
					}
				}
				
				//구구단
				for(int x=2; x<=9 ; x++) {
					
					System.out.println(x+"단");
					
					for(int y=1; y<=9; y++) {
						
						int z = x * y;
						System.out.printf("%d x %d = %d\n", x, y, z);
					}
				}
				
				
				//별삼각형
				for(int start=1; start<=10; start++) {
					
					for(int end=1; end<=start; end++) {
						
						System.out.print("☆");
						
					}
					System.out.print("\n");//개행
				}
				
				
	}

}
