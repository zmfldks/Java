package sub3;
/*
 * 날짜 : 2022/09/02
 * 이름 : 이왕근
 * 내용 : 자바 클래스 연습문제
 */
class Product{
	
	private String category;
	private int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void  () {}
}

class Television {
	
	public Television(String category, int price) {
		super(category, price);
	}
	
}

class Computer  {
	
	public Computer(String category, int price) {
		super(category, price);
	}
	
}

public class Test08 {
	public static void main(String[] args) {
		
		p1 = new Television("가전",100);
		p2 = new Computer("컴퓨터",150);
		
		p1.info();
		p2.info();
	}
}
