package java_8day;
/*
 * 객체의 배열 응용
 */

class Circle {

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

}

public class ListDemo8 {

	public static void main(String[] args) {

		// object array

//		Circle [] circle = new Circle[5];

//		circle[0] = new Circle(1.0);
//		circle[1] = new Circle(2.0);
//		circle[2] = new Circle(3.0);
//		circle[3] = new Circle(4.0);
//		circle[4] = new Circle(5.0);

		Circle[] circle = { new Circle(1.0)
				, new Circle(2.0)
				, new Circle(3.0)
				, new Circle(4.0)
				, new Circle(5.0) };

		for (int i = 0; i < circle.length; i++) {
			System.out.println(circle[i].getArea());

		}
		
		for (Circle c : circle) {
			System.out.printf("원의 넓이 %.2f %.2f \n", c.getRadius(),c.getArea());
		}
	}
}
