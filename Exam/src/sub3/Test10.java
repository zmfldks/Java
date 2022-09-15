package sub3;
/*
 * 날짜 : 2022/09/05
 * 이름 : 이왕근
 * 내용 : 인터페이스 연습문제
 */
interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers implements Buyer, Seller {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer  buyer  = new Customers();
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
	}
}
