package day0531;

//부모, 아이, 강아지 소풍

abstract class Living {
	int x;
	int y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("도착");
	}
}

class Parent extends Living {
	void move(int x, int y) {
		System.out.printf("Parent 위치 : %d, %d\n", x, y);
	}
	void drive() {
		System.out.println("운전");
	}
}
class Child extends Living {
	void move(int x, int y) {
		System.out.printf("Child 위치 : %d, %d\n", x, y);
	}
	void play() {
		System.out.println("놀다");
	}
	void cry() {
		System.out.println("운다");
	}
}
class Dog1 extends Living {
	void move(int x, int y) {
		System.out.printf("Dog 위치 : %d, %d\n", x, y);
	}
	void sleep() {
		System.out.println("잔다");
	}
}


public class PicnicMain {

	public static void main(String[] args) {

		//객체 배열 : 참조변수를 묶은 것
		Living[] group = new Living[3];
		//Object[] group = new Object[3];
		//Object로 다형성은 가능하지만 자손 클래스가 가지고 있는 메서드 및 변수를 사용할 수 없다
		
		group[0] = new Parent();
		group[1] = new Child();
		group[2] = new Dog1();
		
		//Living[] group = {new Parent(), new Child(), new Dog()};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
			group[i].stop();
		}
	
	}
}
















