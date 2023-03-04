package day5;

interface UseThis {
	void use();
}

public class LamdaDemo5 {

	public void lamda() {
		String hi = "hi";
		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				System.out.println(this); // 생성된 새로운 객체의 this

			}
		};
		u1.use();
		UseThis u2 = () -> System.out.println(this); // 메소드 lamda 의 this
		u2.use();
	}

	public static void main(String[] args) {

		LamdaDemo5 demo = new LamdaDemo5();
		demo.lamda();
		System.out.println(demo);
		/*
		 * 람다식 사용시 this 는 자기 자신 을 나타낸다.
		 * 
		 */

	}
}
