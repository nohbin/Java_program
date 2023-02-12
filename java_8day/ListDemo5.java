package java_8day;

public class ListDemo5 {
	
	public static void increase(Integer x) {
		x++;
	}
	public static void main(String[] args) {

		Integer number = 10;
		
		System.out.println("함수 호출 전 변수의 값 : " + number);
		increase(number);
		System.out.println("함수 호출 후 변수의 값 : " + number);
	}
}