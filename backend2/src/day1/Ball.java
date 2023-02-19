package day1;

public class Ball extends Circle {

	String color;

	Ball() {}

	Ball(String color, double radius) {
		this(); // 생성자 안에서 생성자를 호출??
		this.color = color;
		this.radius = radius;
	}

	void findColor() {
		System.out.println(color + " " + "입니다.");
	}
//
//	@Override 
//	void findArea() { // Method Overriding;
//		System.out.println("넓이는 " + (3.14 * radius * radius) + " 이다");
//	}
	
	

	void findVolume() {
		System.out.println("부피는" + ((4.0/3) * 3.14 * radius * radius) + " 이다");
	}

	@Override
	void findArea() {
		
		
	}
	
	
}
