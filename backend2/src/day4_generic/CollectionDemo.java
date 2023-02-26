package day4_generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
	public static void main(String[] args) {

	String [] names = {
			"a","b","a","c","b","a"
			
	};
	List<String> lists = Arrays.asList(names);
	System.out.println(Arrays.asList(names));
		
	Set<String> sets = new HashSet<>(lists);
	
	System.out.println(sets);
	
	// 
	
	
	}
}
