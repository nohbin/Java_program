package day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		String [] fruits = {
				"망고", "딸기","바나나","복숭아"
		};
		Set<String> sets = new HashSet<>();
		
		
		for (String s : fruits) {
			sets.add(s);
		}
		
		sets.contains("ss"); // 컬렉션에 포함 되어 있는지 확인 boolean 형으로 반환
//		array <-> collection
		List<String> lists =  Arrays.asList(fruits);
		
		
		String[] arr = new String[lists.size()];
		
		arr= lists.toArray(arr);
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		Integer[] it = new Integer[] {1,2,3,4};
		
		
//		IntFunction<R>  R apply (int value)
//		 String[] y = x.toArray(String[]::new);
		List<Integer> itList =  Arrays.asList(it);
		
		IntFunction<Integer[]> temp = x-> new Integer[] {x+2 , x*-2 , x-2};
		
		Integer[]result2 = new Integer[itList.size()];
				
		//result2 = itList.toArray(temp);
		
		System.out.println(Arrays.asList(result2));
		 
	
		
	}
}
