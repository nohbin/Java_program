package day1;

public class Circle {

	 double radius = 10.0;
	void secret() {
		System.out.println("secret");
	}

	void findRadius() {
		System.out.println("반지름이" + radius + "센티미터");
	}

	void findArea() {
		System.out.println("넓이는 " + (3.14 * radius * radius) + " 이다");
	}

}


