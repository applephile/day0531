package day0531;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

class Person {
	String name;
	int age;
	String address;
	
	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
}

class Student extends Person{
	String schName;
	String major;
	int schNo;
	double[] avgPo = new double[8];
	
	Student(String name, int age, String address, String schName, String major, int schNo) {
		super(name, age, address);
		this.schName  = schName;
		this.major = major;
		this.schNo = schNo;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("학교명 : " + schName);
		System.out.println("학과 : " + major);
		System.out.println("학번 : " + schNo);
	}
	double average(double avgPo) {
		return avgPo / 8;
	}
}


public class PersonMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Student st = new Student("커리", 35, "샌프란시스코", "데이비슨", "사회학과", 8809);
		st.printInfo();
		
		double avgTwoPo = 0;
		
		for(int i=0; i<st.avgPo.length; i++) {
			System.out.print((i+1)+ "학기 평균 학점 : ");
			st.avgPo[i] = s.nextDouble();
			avgTwoPo += st.average(st.avgPo[i]);
			
		}
		
		System.out.printf("%.2f", avgTwoPo);
	}

}
