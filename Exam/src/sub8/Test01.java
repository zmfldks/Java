package sub8;

import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/29
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		String[] arr1 = {"Apple", "Banana", "Grape", "Orange"};
		Stirng result1 = String
		System.out.println("result1 : " + result1);
		
		String[] arr2 = result1.split("-");
		String result2 = String
		System.out.println("result2 : " +result2);
		
		String[] arr3 = result2.split("(?=[A-Z])");
		Stirng result3 = String
		System.out.println("result3 : " + result3);
		
		StringTokenizer st = new StringTokenizer();
		StringBilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			
		}
		
		String result4 = sb.toString();
		System.out.println("result4 : " + result4);
	}
}
