package java_8day;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Arraylist <참조타입> 참조변수 = new Arraylist<>();
 * 참조타입(data 의 타입) integer String long etc....
 * 참조변수.add(데이터) = 추가
 * 참조변수.remove(인덱스번호) = 제거
 * 참조변수.get(인덱스번호) = 호출
 * 참조변수.size() = 갯수
 * 
 */
public class ListDemo2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for (int i = 10; i < 15; i++) {
			list.add(i);
		}
		
		
		
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(0, 100);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
