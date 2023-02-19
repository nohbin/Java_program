package day1;

/*
 * 상속관계가 아니면 안됨 -- class 간 형변환은 상속관계
 * type 을 상위타입으로 변경한다.
 * 형변환 (type casting)
 * 자동으로 형변환 (Auto Casting) 
 * 상속관계에서 자식이 부모타입으로 변경하는걸 뜻한다.
 */
public class UpCastDemo {
	public static void main(String[] args) {
		Person p = null;
		Student s = new Student();
		
		
		p = s; // upcasting
		
		
		
		
	}
}
