package sub7;
/*
 * 날짜 : 2022/08/31
 * 이름 : 이왕근
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * - 상속관계에서 부모 클래스의 기능(메서드)이 자식 클래스에서 여러 기능(메서드)으로 변하는 특성 (자식 클래스에서 재정의)
 * - 객체의 타입선언을 부모 클래스 타입으로 선언하는 것(문법적으로 다형성)
 * - 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성 높인다. 
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		// 다형성을 적용한 객체생성(업 캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
	
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		
		// 다운 캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		eagle.move();
		shark.move();
		
		// 객체 타입 비교연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger 입니다.");
		}
		
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle 입니다.");
		}
		
		if(a3 instanceof Shark) {
			System.out.println("a3는 Shark 입니다.");
		}
		
		// 다형성 활용
		Animal []arr = {tiger, eagle, shark}; //객체 배열
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
		
		
	}
}
