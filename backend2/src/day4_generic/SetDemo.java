package day4_generic;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	
	Set<String> set = new HashSet<>(); // 중복을 허용 하지 않는다.
	set.add("nohbin");
	set.add("nohbin");
	set.add("nohbin");
	set.remove(set);
	
	
	System.out.println(set);
}
}
