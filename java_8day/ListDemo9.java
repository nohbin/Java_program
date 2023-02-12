package java_8day;

public class ListDemo9 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		
		zero(c1); // c1 의 주소값을 zero(객채) 로 변경 하여 값이 변경 되는것 같다.
		System.out.println("원 c1 의 반지릅 : " + c1.getRadius());
		zero(c2.getRadius()); // 
		System.out.println("원 c2의 반지름 : " + c2.getRadius());

	}

	public static void zero(Circle c) { // 객체 생성 
		c.setRadius(0.0); // 객채.메서드 의 주소값을 지정
	}

	public static void zero(double r) {
		 r = 0.0;
	}
}
