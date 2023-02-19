package day1;

/*
 * 상속관계가 아니면 안됨 -- class 간 형변환은 상속관계
 * type 을 상위타입으로 변경한다.
 * 형변환 (type casting)
 * 상속관계에서 자식이 부모타입으로 변경하는걸 뜻한다.
 * downcast 타입을 자식타입으로 변경한다. (형변환 필요함)
 */
public class DownCastDemo {
	public static void main(String[] args) {
		
		
		Person p = new Student(); // 업케스트 자동
		
		Student s = (Student) p; // 다운케스트 수동
		
		// 객체 p 는 자신의 타입의 객체가 있을수도 있고
		// 자식들의 객체가 들어있을 수도 있다.
		
//		Person p = null;
//		Student s = new Student();		
//		p = s;
//		Student s2 = (Student)p; // DownCasting
//		
		
	}
}
