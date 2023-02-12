package java_7day;

public class Circle {

	public Circle() {
	}

	public Circle(double d) {
		radius = d;
	}

	public static int circleMaxNum = 100; // 정적멤버변수 static

	public static final int MAXCIRCLENUM = 200;

	private double radius; // 인스턴스멤버 변수 instance

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 인스턴스 메소드
	public double getSize() {
		System.out.println(MAXCIRCLENUM);
		System.out.println(circleMaxNum);

		return radius * radius * 3.14;
	}

	// 스태틱 메소드
	public static double show() {
		System.out.println(MAXCIRCLENUM);
		System.out.println(circleMaxNum);

		return 0.0; // 정적 메소드 안에서는 인스턴스 요소를 사용할수 없다
					// this. 도 사용 불가능
	}

	// static 은 끼리끼리낄낄 논다.. / 민족주의, 우월주의 , 군국주의
	//

}
