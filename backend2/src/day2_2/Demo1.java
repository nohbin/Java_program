package day2_2;

public class Demo1 {

	// 인터페이스를 사용하지 않은 함수 - 커플링
	public static void show(Adult a) {
		a.howOldAreYou();
	}

	// 인터페이스를 사용하여 디커플링 된 함수
	public static void showObject(Person p) {
		p.howOldAreYou();
	}

	public static void main(String[] args) {
		
		Person data = new Adult();
		showObject(data);
		
		
		
	}

}
