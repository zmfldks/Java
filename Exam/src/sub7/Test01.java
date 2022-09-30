package sub7;
/*
 * 날짜 : 2022/09/28
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */
class Box
{
	private double width;
	private double height;
	private double depth;
	
	
	
	public  volume() {
		return width * height * depth;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Box box1 = new Box(1, 2, 3);
		Box box2 = new Box(3, 6, 9);
		
		System.out.println("box1 부피 : " + box1.volume());
		System.out.println("box2 부피 : " + box2.volume());
	}
}
