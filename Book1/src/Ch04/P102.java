package Ch04;
/*
 * 날짜 : 2022/09/20
 * 이름 : 이왕근
 * 내용 : switch-case문 예제
 */
public class P102 {
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
			break;
		case 2 : medalColor = 'S';
			break;
		case 3 : medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
	}
}

