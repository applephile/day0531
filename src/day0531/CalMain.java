package day0531;

import java.util.Scanner;

//클래스 이름 : Calculator.java
//추상 메서드 이름 : 매개변수 2개인 add, minus, mul, div
//Calculator를 상속받는 Cal.java 생성
//CalMain.java 생성 후 사용자에게 두 수를 입력받는다
//Cal.java로 계산하여 결과 출력

abstract class Calculator {
	abstract int add(int num1, int num2);
	abstract int minus(int num1, int num2);
	abstract int mul(int num1, int num2);
	abstract int div(int num1, int num2);
}

class Cal extends Calculator{
	int add(int num1, int num2) {
		return num1 + num2;
	}
	int minus(int num1, int num2) {
		return num1 - num2;
	}
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	int div(int num1, int num2) {
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
		
	}
}

public class CalMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Cal c = new Cal();
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = s.nextInt();
		
		System.out.printf("%d + %d = %d\n", num1, num2, c.add(num1, num2));
		System.out.printf("%d - %d = %d\n", num1, num2, c.minus(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, c.mul(num1, num2));
		System.out.printf("%d / %d = %d\n", num1, num2, c.div(num1, num2));
		
		s.close();
	}

}
