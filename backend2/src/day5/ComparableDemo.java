package day5;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle> {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
public int findArea() {
	return width*height;
}
@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}
@Override
public int compareTo(Rectangle o) {
	// TODO Auto-generated method stub
	return this.findArea() - o.findArea();
			
}


}

public class ComparableDemo {
	public static void main(String[] args) {
//
//		List<Rectangle> lists = new ArrayList<>();
//		
//		lists.add(new Rectangle(3, 4));
//		lists.add(new Rectangle(4, 5));
		
		
		Rectangle r [] = {
				new Rectangle(10, 15) ,
				new Rectangle(2, 5) ,
				new Rectangle(4, 3)
		};
		
		// 클래스 내부에 정렬 기능을 내장
		
		Arrays.sort(r);
		
		
		// 정렬을 수행하는 익명 클래스 객체를 바로 생성하여 사용
		Arrays.sort(r, new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle o1, Rectangle o2) {
				
				return (o1.findArea() - o2.findArea());
			}
		});
		
		// 람다식 , 기능만 수행 가능 한 익명의 함수 
		Arrays.sort(r, (o1,o2) ->o1.findArea() - o2.findArea());
		
		
		
		
		/*
		 * 인터페이스가 상속받아 클래스를 만들어 클래스의 객체를 제공해줘야 하는데
		 * 익명 클래스를 사용하여 발전 함, 지저분해 보이니
		 * 함수만 제공할수 있는 방법 -> 람다식 
		 */
		
		
		
		for (Rectangle rectangle : r) {
			System.out.println(rectangle);
		}
		
	} 
	 
	
}
