package java_6day;

public class Circle {
	
	public Circle() {}
	
	public Circle(String color , double radius) {
		this.radius = radius;
		System.out.printf("색상은 %s 이고 넓이는 %.2f 입니다.\n",color,result());
	}

	private String color;
	private double radius;
	
	public String getColor() {
		return color;
	}
	public Circle setColor(String color) {
		this.color = color;
		return this;
	}
	public double getRadius() {
		return radius;
	}
	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	
	public double result() {
		return 3.14 * radius * radius;
	}
	
	public void show() {
		System.out.printf("색상은 %s 이고 넓이는 %.2f 입니다.\n",color,result());
	}
	
	
	
	
	
}
