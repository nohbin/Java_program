package java_7day;

public class CircleDemo {
	
	public static void main(StringDemo[] args) {

		System.out.println(Circle.circleMaxNum); // 스테틱맴버

		Circle c = new Circle();

		c.setRadius(10.0); // 인스턴스맴버
		System.out.println(c.getRadius());

		Circle c2 = new Circle();
	//	System.out.println(Circle.MAXCIRCLENUM);
		
		System.out.println(System.identityHashCode(c2.MAXCIRCLENUM));
		System.out.println(System.identityHashCode(c.MAXCIRCLENUM));
	}
}
