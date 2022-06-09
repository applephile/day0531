package day0531;

//비행기, 차 클래스 생성

abstract class Vehicle {
	int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도를 " + speed + "로 설정");
	}
	
	abstract void show();
}

class Car extends Vehicle {
	int num;
	double gas;
	
	Car(){}
	Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "인 자동차 생성");
	}
	void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
		System.out.println("속도 : " + speed);
	}
}

class Plane extends Vehicle{
	int flight;
	
	Plane(){}
	Plane(int flight){
		this.flight = flight;
		System.out.println("비행기 번호 : " + flight + "인 비행기 생성");
	}
	void show() {
		System.out.println("비행기 번호 : " + flight);
		System.out.println("속도 : " + speed);
	}
}

public class AbstMain {

	public static void main(String[] args) {
		
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 12.34);
		vc[0].setSpeed(80);
		vc[0].show();
		
		vc[1] = new Plane(1234);
		vc[1].setSpeed(980);
		vc[1].show();
		
		
		
		
		
	}

}
