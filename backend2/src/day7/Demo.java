package day7;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		 Stream<String> ss;
	     List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
	     
	     
	     
	    
	     
	    // 성이 이씨 인 사람들은 찾아서 출력.
	    names.stream().filter(x->x.charAt(0)=='김').forEach(x->System.out.println(x + " "));
	    // 정렬
	    names.stream().sorted().forEach(x->System.out.print(x + " "));
	    // 총 몇명인지 출력
	    System.out.println(names.size());
	    names.stream().sorted(Collections.reverseOrder()).forEach(x->System.out.print(x + " "));
	    

	}
}
