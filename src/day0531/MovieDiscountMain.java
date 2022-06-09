package day0531;

//영화 예매 금액의 총 합계 계산
//모든 영화의 정가는 10,000원, 기본 할인율 10%

//장르별 추가 할인 가능 
//액션 : 1,000원
//공포 : 800원
//코미디 : 1,500원

//총 3장의 영화를 예매하시오
//총 예매 금액 출력

//범죄도시(액션)
//여고괴담(공포)
//극한직업(코미디)

//클래스 이름 : ActionMovie, HorrorMovie, ComedyMovie
//추가로 필요한 클래스 본인 작성

abstract class Movie {
	String name;
	int price = 10000;
	double discountRate = 0.1;
	
	Movie(String name){
		this.name = name;
	}
	abstract double discountedPrice();
//	double discountedPrice() {
//		price * (1 - discountRate);
//	}
}

class ActionMovie extends Movie {
	ActionMovie(String name){
		super(name);
	}
	double discountedPrice() {
		return price * (1 - discountRate) - 1000;
	}
	
//	double discountedPrice() {
//		return super.discountedPrice() - 1000;
//	}
}

class HorrorMovie extends Movie {
	HorrorMovie(String name){
		super(name);
	}
	double discountedPrice() {
		return price * (1 - discountRate) - 800;
	}
//	double discountedPrice() {
//	return super.discountedPrice() - 800;
//}
}

class ComedyMovie extends Movie {
	ComedyMovie(String name){
		super(name);
	}
	double discountedPrice() {
		return price * (1 - discountRate) - 1500;
	}
//	double discountedPrice() {
//	return super.discountedPrice() - 1500;
//}
}

// 내 방식
//class Movie {
//	String name;
//	final int ticket = 10000;
//	final int comDiscount = (int)(ticket / 10.0);
//	static int result;
//	
//}

//class ActionMovie extends Movie {
//	final int actDiscount = 1000;
//	
//	ActionMovie(String name){
//		this.name = name;
//		System.out.println(name + " 예매 완료");
//		result += ticket - comDiscount - actDiscount;
//	}
//}
//
//class HorrorMovie extends Movie {
//	final int horDiscount = 800;
//	
//	HorrorMovie(String name){
//		this.name = name;
//		System.out.println(name + " 예매 완료");
//		result += ticket - comDiscount - horDiscount;
//	}
//}
//
//class ComedyMovie extends Movie {
//	final int comedyDiscount = 1500;
//	
//	ComedyMovie(String name){
//		this.name = name;
//		System.out.println(name + " 예매 완료");
//		result += ticket - comDiscount - comedyDiscount;
//	}
//}
public class MovieDiscountMain {

	public static void main(String[] args) {
		
//		ActionMovie am = new ActionMovie("범죄도시");
//		HorrorMovie hm = new HorrorMovie("여고괴담");
//		ComedyMovie cm = new ComedyMovie("극한직업");
//		 
//		int sum = 0;
//		
//		sum += am.discountedPrice();
//		sum += hm.discountedPrice(); 
//		sum += cm.discountedPrice();
		
		Movie[] movie = {new ActionMovie("범죄도시"), new HorrorMovie("여고괴담"), new ComedyMovie("극한직업")};
		
		int sum = 0;
//		for(int i = 0; i<movie.length; i++) {
//			sum += movie[i].discountedPrice();
//		}
		
		for(Movie m : movie) {
			sum += m.discountedPrice();
		}
		
		System.out.println("총 예매 금액 : " + sum);
		
		//내 방식
//		Movie m1 = new ActionMovie("범죄도시");
//		Movie m2 = new HorrorMovie("여고괴담");
//		Movie m3 = new ComedyMovie("극한직업");
//	
//		System.out.printf("총 영화 예매 금액 : %,d\n", Movie.result);
	}

}
