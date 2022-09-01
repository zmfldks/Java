package sub2;
/*
 * 날짜 : 2022/09/01
 * 이름 : 이왕근
 * 내용 : 인터페이스 실습하기
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
	
		// 인터페이스 구현 클래스 객체 생성
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
		Car bongo = new Truck("봉고", "파란색", 0);
		bongo.speedUp(90);
		bongo.speedDown(30);
		bongo.show();
		
		
		// 인터페이스 결합도 완화
		
		
		
		
		
	}
}
