package day2;
/*
 * 놀이공원 입장객 의 총 입장 수입
 * 
 * 어른 30000
 * 어린이 5000
 * 청소년 20000
 *  
 */
public class Person {
	
	private static int count = 0;
	
	
	public Person() {count++;}
	
	public Person(int price) {
		this.price = price;
	}
	
	protected int price = 30000;

	public int getPrice() {
		return price;
	}

	public static int getCount() {
		return count;
	}

	

	
	
	
}
