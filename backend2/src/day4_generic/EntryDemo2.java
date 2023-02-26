package day4_generic;

import java.util.HashMap;
import java.util.Map;

public class EntryDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("수학",90);
		map1.put("영어", 98);
		map1.put("국어",100);
		
	
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("수학",90);
		map2.put("영어", 98);
		map2.put("국어",100);
		
		Map<String, Integer> map3 = new HashMap<>();
		map2.put("수학",90);
		map2.put("영어", 98);
		map2.put("국어",100);
		
		
		
		
		Map<String, Map<String,Integer>> maps = new HashMap<>();
		maps.put("홍길동", map1);
		maps.put("성노빈", map2);
		maps.put("김철수", map2);
		System.out.println(maps);
		
		
	}
}
