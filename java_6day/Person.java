package java_6day;

/**
 * 클래스의 95% 이상은 맴버변수를 만들때 @@캡슐화 한다. private 는 필수!
 * 
 * @author 성노빈
 *
 */
public class Person {
	
	public void inIt() {
		
	}

	public Person() {
		
		this(1, 1, 1, null);
	}

	// 생성자 메소드는 생략되어있다.
	// 매개변수가 없는 > 기본생성자 > 객체를 만들어준다
	// 시스템에서 알아서 객체를 생성해준다.

	public Person(int age, int height, int weight, String name) {
		super(); // 부모 생성자 호출
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	private int age;
	private int height;
	private int weight;
	private String name;
}
