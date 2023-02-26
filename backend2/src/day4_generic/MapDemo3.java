package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo3 {
	public static void main(String[] args) {

		
		List<Integer> lists = new ArrayList<>();
		Map<Integer, Integer> maps = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			lists.add((int)(Math.random()*5)+1);
		}
		System.out.println(lists);
			
	
		/*
		 * 맵 구조로 만들어보자
		 * 1:3 , 2:1 , 3:0 , 4:1, 5:5
		 */
		
		
		for (Integer data : lists) {
			if(!maps.containsKey(data)) {
				maps.put(data,1);
			}else {
				maps.put(data, maps.get(data)+1);
			}
		}
	
		
		
		System.out.println(maps);
		
		
		
	
		
	
		
		
		
		
		
		
		
		

	}
}
