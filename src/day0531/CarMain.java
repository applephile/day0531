package day0531;

class Car1 {
	int maxSpeed;
	int speed;
	
	Car1(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	void speedUp() {}
	void speedUp(int speed) {
		if(speed > this.maxSpeed) {
			return; 
		}
		this.speed = speed;
	}
	void speedDown() {}
	void speedDown(int speed) {
		if(speed < 0) {
			return;
		}
		this.speed = speed;
	}
	
}

public class CarMain {

	public static void main(String[] args) {
		Car1 c = new Car1(400);
		c.speedUp(100);
		
		c.speedDown(-1);
		System.out.println(c.speed);
		c.speedUp(500);
		System.out.println(c.speed);

	}

}
