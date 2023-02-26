package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		// key 에 들어가는 값은 unique 하다.
		
		map.put("ABC", 123);
		map.put("DEF", 456);
		map.put("GHI", 789);
		System.out.println(map.get("ABC"));
		
		int a = 10;
		List<Integer> lists = new ArrayList<>();
		lists.add(a);
		System.out.println(lists.get(a));
		//a=11;
		System.out.println(lists.get(a));
		
		
		
		
	}
}
