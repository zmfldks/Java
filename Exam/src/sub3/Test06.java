package sub3;
/*
 * 날짜 : 2022/09/02
 * 이름 : 이왕근
 * 내용 : 자바 클래스 연습문제
 */
class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent {
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment();
		
	}
}
public class Test06 {
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}
}
