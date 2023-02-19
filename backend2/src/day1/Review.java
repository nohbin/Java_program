package day1;

/*
 * 함수의 매개변수 전달 방법 - 무조건 값을 copy 
 * 일반변수 VS 객체(배열)
 * Class 변수 ---> 객체
 * Class 외 변수 --> 일반 변수  
 */
public class Review {
	
	public static void method(int x, String y, int[]z) {
		x= 1000;
		y = "hong gil dong";
		z[0]= 10000;
	}
	public static void main(String[] args) {
		int a = 0;
		String name = "hello"; // 배열처럼 각 문자를 control 할수 있다.
		int[] b = { 0 };
		
		System.out.println(a);
		System.out.println(name);
		System.out.println(b[0]);
		
		method(a,name,b);
		System.out.println(a);
		System.out.println(name);
		System.out.println(b[0]);

	}
}
