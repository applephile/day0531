package day0531;

abstract class Employee {
	String name;
	int age;
	String address;
	String dName;
	int sal;
	
	Employee(String name, int age, String address, String dName) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dName = dName;
		System.out.printf("이름 : %s\n나이 : %d\n지역 : %s\n부서 : %s\n", this.name, this.age, this.address, this.dName);
	}
	
//	public void printInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("주소 : " + address);
//		System.out.println("부서 : " + dName);
//	}
	
	public void setSal() {
		
	}
	public void setTimeSal(){
		
	}
	
	abstract void printInfo();
}

class Regular extends Employee {
	Regular(String name, int age, String address, String dName) {
		super(name, age, address, dName);
	}
	void setSal(int sal) {
		this.sal = sal;
	}
//	public void printInfo() {
//		super.printInfo();
//		System.out.println("비정규직");
//		System.out.println("급여 : " + sal);
//	}
	void printInfo() {
		System.out.println("정규직");
		System.out.println("급여 : " + sal);
	}
}
class Temporary extends Employee {
	int workTime;
	int aTimeSal = 10000;
	
	Temporary(String name, int age, String address, String dName) {
		super(name, age, address, dName);
//		aTimeSal = 10000;
	}
	void setTimeSal(int workTime) {
		this.workTime = workTime;
		this.sal = workTime * aTimeSal;
	}
//	public void printInfo() {
//		super.printInfo();
//		System.out.println("비정규직");
//		System.out.println("급여 : " + sal);
//	}
	void printInfo() {
		System.out.println("비정규직");
		System.out.println("일한 시간 : " + workTime);
		System.out.println("급여 : " + sal);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		
//		Regular r = new Regular("김그린", 35, "샌프란시스코", "인사부");
//		Temporary r = new Temporary("김그린", 35, "샌프란시스코", "인사부");
		
//		r.setSal(5000000);
//		r.printInfo();
//		System.out.println();
//		t.setTimeSal(120);
//		t.printInfo();
		
//		Regular r = new Regular("김그린", 35, "샌프란시스코", "인사부");
//		Temporary r = new Temporary("김그린", 35, "샌프란시스코", "인사부");
		
//		Employee[] r = {new Regular("김그린", 35, "샌프란시스코", "인사부"), new Temporary("이자바", 22, "보스턴", "개발부")}
		
		Regular r = new Regular("김그린", 35, "샌프란시스코", "인사부"); 
		r.setSal(5000000);
		r.printInfo();
		
		System.out.println();
		
		Temporary t = new Temporary("이자바", 22, "보스턴", "개발부");
		t.setTimeSal(120);
		t.printInfo();
		
	}

}









