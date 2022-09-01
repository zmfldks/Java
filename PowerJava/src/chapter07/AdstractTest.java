package chapter07;
/*
 * 날짜 : 2022/09/01
 * 이름 : 이왕근
 * 내용 : 추상클래스 복습하기
 * 
 */

public abstract class Shape {
	int x, y;
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}

class Rectangle extends Shape{
	int width, height;
	public void draw() {System.out.println("사각형 그리기 메소드");}
}

class Circle extends Shape{
	int radius;
	public void draw() {System.out.println("원 그리기 메소드");}
}

public class AdstractTest {
	public static void main(String[] args) {
		
	}
}
