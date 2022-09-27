package sub6;
/*
 * 날짜 : 2022/09/27
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */
public class Test05 {
	public static void main(String[] args) {
		int[] values = {3, 5, 2, 7, 1};
		PrintArray(values);
		
		for(int i = 4; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if(values[j] > values[j + 1])
				{
					int temp = values[j];
					values[j] =values[j + 1];
					values[j + 1] = temp;
				}
			}
			PrintArray(values);
		}
	}
	
	public static void PrintArray(int[] array) {
		for (int i : array)
			System.out.printf("%5d", i);
		System.out.print("\n");
	}
}
