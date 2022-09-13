package sub1;

public class Banana {

	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		// 객체의 정보 조회할 때(toString)
		System.out.println("객체번호 :"+ hashCode());// 객체의 식별번호(해시값)
		System.out.println("원산지 :"+ country);
		System.out.println("가격 :"+ price);
		
		return super.toString();
	}
}
