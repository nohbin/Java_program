package day6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// arraylist 사용하기
		// 객체 생성 하기
		List<Integer> lists = new ArrayList<>();
		// 요소 저장
		lists.add(1);
		lists.add(2);
		lists.add(3);
		lists.add(4);
		lists.add(5);
		
		// for each 사용해보기
//		for (Integer integer : lists) {
//			System.out.println(integer);
//		}
		
		//Consumer<T> void accept(T t); 
		
		lists.forEach(x -> System.out.println(x));
		
		
		
	}
}
