package day8;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import day7.Nation;
import day7.Utill;

public class FilterDemo {
	public static void main(String[] args) {

		
		Stream<String> s1 = Stream.of("a1","b1","b2","c1","c2","c3");
		// 대문자로 변환
		
		
		
		String str = "abcde";
		System.out.println(str.startsWith("a"));
		// Q1 C로 시작하는 문자열 들만 추출
		Stream<String> s2 = s1.filter(x->x.startsWith("c"));
		s2.forEach(Utill::print);

		IntStream i1 =  IntStream.of(1,2,3,4,3,2,2,1,3);
		i1.filter(x->x%2==0).forEach(Utill::print);
		
		
		
		// nation 의 population 100 보다 큰 나라만 출력
		
		List<Nation> lists = Nation.nations;
		
		Stream<Nation> sn1 = Nation.nations.stream();
		Stream<Nation> sn2 = sn1.filter(x->x.getPopulation()>100);
		sn2.forEach(x->System.out.println(x.toString())); // 
		
		
		
		
	}
}
