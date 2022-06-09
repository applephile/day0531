package day0531;

abstract class Currency {
	double amount;
	
	Currency(double amount) {
		this.amount = amount;
	}
	abstract void printInfo();
}

class KRW extends Currency {
	KRW(double amount){
		super(amount);
	}
	void printInfo() {
		System.out.printf("KRW : %.2f원\n", amount);
	}
}

class USD extends Currency {
	USD(double amount) {
		super(amount);
	}
	void printInfo() {
		System.out.printf("USD : %.2f달러\n", amount);
	}
}

class EUR extends Currency {
	EUR(double amount) {
		super(amount);
	}
	void printInfo() {
		System.out.printf("EUR : %.2f유로\n", amount);
	}
}

//abstract class Currency {
//	int krw;
//	double usd;
//	double eur;
//	
//	abstract void show();
//}
//
//class Krw extends Currency{
//	Krw(int krw){
//		this.krw = krw;
//	}
//	
//	void show() {
//		System.out.printf("KRW : %.2f원\n", (double)krw);
//	}
//}
//class Usd extends Currency{
//	Usd(double usd){
//		this.usd = usd;
//	}
//	
//	void show() {
//		System.out.printf("USD : %.2f달러\n", usd);
//	}
//	
//}
//class Eur extends Currency{
//	Eur(double eur){
//		this.eur = eur;
//	}
//	
//	void show() {
//		System.out.printf("EUR : %.2f유로\n", eur);
//	}
//}

public class CurrencyMain {

	public static void main(String[] args) {
		

		Currency[] curr = {new KRW(1500.00), new USD(100.50), new EUR(260.75)};
		
//		for(int i=0; i<curr.length; i++) {
//			curr[i].printInfo();
//		}
		//향상된 for문
		for(Currency c : curr) {
			c.printInfo();
		}
		
//		Currency[] cu = {new Krw(1500), new Usd(100.50), new Eur(260.75)};
//		
//		for(int i=0; i<cu.length; i++) {
//			cu[i].show();
//		}
		
	}

}
