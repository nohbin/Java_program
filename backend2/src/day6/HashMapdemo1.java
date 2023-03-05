package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapdemo1 {
	public static void main(String[] args) {

		Map<String, Integer> maps = Map.of("성노빈", 97, "철수", 60);

	

		Map<String, Integer> peoples = new HashMap<>(maps);
		
		Map<Student, Integer> stMap = new HashMap<>();
		
		stMap.put(new Student("성노빈"), 10);
		stMap.put(new Student("김지수"), 20);
		stMap.put(new Student("성노빈"), 5);
		
		stMap.forEach((k,v) -> System.out.println(k.getName() + v));
		
		
		
			
	}
}
