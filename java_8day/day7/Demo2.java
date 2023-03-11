package day7;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {
	
	enum Gender{MALE ,FEMALE}
	
	public static void main(String[] args) {

		Stream<String> ss;
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.MALE, Gender.FEMALE, Gender.MALE, Gender.MALE, Gender.MALE, Gender.FEMALE);
		
       
        Stream<Integer> as  = ages.stream();
        as.reduce(0,(x,y)-> x+y); // 합계 구하기.
        
        as = ages.stream();
        System.out.println(as.max(Integer::compare).get());
        
        as = ages.stream();
        System.out.println(as.min(Integer::compare).get());
        
        
        IntStream is = ages.stream().mapToInt(x->x.intValue()); // Integer list 에서 intStream 으로 typeCasting 진행
        System.out.println(is.average().getAsDouble());
        
        is.average().getAsDouble();
        
       
		
	}
}
