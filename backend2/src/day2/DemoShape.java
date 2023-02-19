package day2;

public class DemoShape {
	public static void main(String[] args) {

		Circle circle = new Circle(2);
		
		System.out.println(circle.findArea());
		circle.draw();
		
		Circle[]c = {new Circle(2),new Circle(3),new Circle(4),new Circle(5),new Circle(6)};
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].findArea());
		}
	}
}
