package Ch03;
/*
 * 날짜 : 2022/09/16
 * 이름 : 이왕근
 * 내용 : 비트 이동 연산자를 사용하여 연산하기
 */
public class P85 {
	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num =num << 2;
		System.out.println(num);
		
		
	
	}
}
