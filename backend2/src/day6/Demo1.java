package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		List<String> temp = List.of("111", "333", "222", "444");

		List<String> lists = new ArrayList<>(temp);
		Set<String> sets = new HashSet<>(temp);

		Collections.sort(lists, Collections.reverseOrder()); // 뒤집어 정렬해줌
		
		System.out.println(lists);
		
		List<String> lists2 = Arrays.asList("111", "333", "222", "444");
		
	System.out.println(	Collections.binarySearch(lists2, "222"));
		
	}
}
