package day0531;

class Product {
	int price;
	int bonus;
	
	Product(){}
	
	Product(int price) {
		this.price = price;
		bonus = (int)(price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100); //부모 생성자 호출
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonus = 0;
	Product[] cart = new Product[10];
	int i = 0;
	
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonus += p.bonus;
		cart[i++] = p;
		System.out.println(p + "를 구입");
	}
	
	//구매한 물품에 대한 요약 정보 표시
	void summary() {
		int sum = 0;
		String itemList = "";
		
		//구매한 물품의 총 합계, 물건 목록 표시
		for(int i = 0; i<cart.length; i++) {
			if(cart[i] == null) break;
			
			sum += cart[i].price;
			itemList += (i==0) ? "" + cart[i] : ", " + cart[i];
//			if(i == 0) {
//				itemList += "" + cart[i];
//			} else {
//				itemList += ", " + cart[i];
//			}
			
		}
		System.out.println("총 금액 : " + sum);
		System.out.println("구매 물품 : " + itemList);
	}
}
public class Array {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
//		Product p = new Tv();
//		b.buy(p);
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
		
	}

}
