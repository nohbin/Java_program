package solo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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
		
		String[] str = new String[sets.size()];
		
		Iterator<String> str2 = sets.iterator();
		
		
		for (int i = 0; i < str.length; i++) {
			str[i] = str2.next();
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		names = str;
		
		
		
		
	}
	
}
