package day0531;

abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("호흡");
	}
	
	abstract void sound();
}

class Dog extends Animal {
	Dog(){
		this.kind = "포유류";
	}
	void sound() {
		System.out.println("왈왈");
	}
}

class Cat extends Animal {
	Cat(){
		this.kind = "포유류";
	}
	void sound() {
		System.out.println("야옹");
	}
}

public class AnimalMain {

	public static void main(String[] args) {

		//sound() 메서드 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("------------------------");
		
		//부모 타입의 참조변수를 사용하여 자식 sound()메서드 호출
		//자식은 부모타입으로 자동 형변환이 된다
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------------------------");
		
		//메서드 생성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
