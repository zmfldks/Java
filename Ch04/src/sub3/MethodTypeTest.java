package sub3;
/*
 * 날짜 : 2022/08/23
 * 이름 : 이왕근
 * 내용 : Java 메서드 타입 실습하기
 * 
 * 
 */
public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		double r1 = type1(1.1);
		double r2 = type1(2.1);
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		
		
		type2(true);
		type2(false);
		
		boolean r3 = type3();
		System.out.println("r3 :"+r3);
		
		type4();
		
	}//main end

	// type 1 : 매개변수 0, 리턴값 0
	public static double type1(double x){
		double y = x + 3.14;
		return y;
	}
	
	// type 2 : 매개변수 0, 리턴값 x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// type 3 : 매개변수 x, 리턴값 0
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// type 4 : 매개변수 x, 리턴값 x
	public static void type4() {
		System.out.println("type4 result :"+type1(1.2));
	}
}
