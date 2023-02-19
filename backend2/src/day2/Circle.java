package day2;



public class Circle extends Shape {

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	void draw() {
		System.out.println("원을 그린다");		
	}
	
	
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		
		return pi*radius*radius;
	}
	
	
	
	

	

}
