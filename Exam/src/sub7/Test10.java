package sub7;
/*
 * 날짜 : 2022/09/28
 * 이름 : 이왕근
 * 내용 : 자바 총정리 연습문제
 */
class Human {
	public void print() {
		System.out.println("사람 입니다.");
	}
}

class Man extends Human {
	
}

class Woman extends Human {
	
}
public class Test10 {
	public static void main(String[] args) {
		
		Human p1 = makeHuman(1);
		Human p2 = makeHuman(2);
		
		p1.print();
		p2.print();
	}
	
	public static Human makeHuman(int kind) {
		if(kind == 1) {
			
		}else {
			
		}
	}
	
}
