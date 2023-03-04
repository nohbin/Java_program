package day5;

interface Negative { // 인터페이스에서 구현하는 함수가 한개 일시 ,
	int neg(int x);
}

public class LamdaDemo1 {
	public static void main(String[] args) {
		Negative n = new Negative() {		
			@Override
			public int neg(int x) {
				// TODO Auto-generated method stub
				return -x;
			}
		};
		
		
		n = (int x) -> {return -x;};
		System.out.println(n.neg(10));
		
		n = (x) -> {return -x;}; // 자료형 생략 가능
		n = x->{return -x;}; // 매개변수 하나 일시 괄호 생략 가능 , 중괄호 있을 시 return 문 가능
		n = x-> -x;
		
		
	}

}
