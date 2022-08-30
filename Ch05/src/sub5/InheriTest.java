package sub5;
/*
 * 날짜 : 2022/08/30
 * 이름 : 이왕근
 * 내용 : Java 클래스 상속 실습하기
 * 
 * 상속(Inheritance)
 * - 기존 클래스의 속성과 기능을 그대로 자식 클래스에 물려주는 클래스 확장 문법
 * - 공통적인 로직 내용을 부모 클래스에 두고 자식 클래스에서 상속 받아 일관성 있는 프로그래밍 수행
 * - 부모 클래스의 속성 접근권한 protected 선언하고 자식 클래스 부모 클래스 속성을 초기화
 */
class Parent{
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent{
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	public int minus() {
		return num3 - num4;
	}
	
}

public class InheriTest {
	public static void main(String[] args) {
		
		// 상속 객체 생성
		Child c = new Child(1, 2, 3, 4);
		
		int r1 = c.plus();
		int r2 = c.minus();
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		
		
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "파란색", 0, 0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();
		
		//Account 상속 객체 생성
		StockAccount kb = new StockAccount("kb증권", "101-12-1010", "홍길동", 0, "삼성전자", 10, 50000);
		kb.deposit(1000000);
		kb.buy(10, 55000);
		kb.sell(15, 56000);
		kb.withdraw(200000);
		kb.show();
		
	}
}
