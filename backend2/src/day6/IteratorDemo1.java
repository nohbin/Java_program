package day6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
	public static void main(String[] args) {

		
		Collection<String> lists = Arrays.asList("a","b","c");
		
//		lists.forEach(x -> System.out.println(x));
		// 
		Iterator<String> it = lists.iterator();
		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		// 2번째 순환
//		System.out.println("----------------");
//		while (it.hasNext()) {
//			System.out.println(it.);
//		}
		
		it.forEachRemaining(x-> System.out.println(x));
		
		
	}
}
