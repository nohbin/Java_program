package day7;

import java.util.Optional;

public class OptionalDemo2 {
	
	public static void main(String[] args) {

		String s1 = "hello";
		Optional<String> o = Optional.ofNullable(s1);
		if(s1 != null) {
			Utill.pirnt(s1);
		}else {
			Utill.pirnt("X");
		}
		
		if(o.isPresent()) {
			Utill.pirnt(o.get());
		}else {
			Utill.pirnt("null");
		}
		
			
		
	}
}
