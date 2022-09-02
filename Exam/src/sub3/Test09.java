package sub3;
/*
 * 날짜 : 2022/09/02
 * 이름 : 이왕근
 * 내용 : 자바 클래스 연습문제
 */
abstract class Shape{
	public abstract void draw();
}

clas Triangle extends Shape{
	
}

class Circle extends  {
	
}

public class Test09 {
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw( obj) {
		obj.draw();
	}
	
}
