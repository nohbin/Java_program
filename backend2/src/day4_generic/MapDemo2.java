package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, String> map0 = new HashMap<>();
		map0.put("name", "a");
		map0.put("age", "29");
		map0.put("id", "b");
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "f");
		map1.put("age", "39");
		map1.put("id", "g");
		
		List<Map<String,String>> lists = new ArrayList<>();
		
		lists.add(map1);
		lists.add(map0);
		
		System.out.println(lists);
		
		
		
	}
}
