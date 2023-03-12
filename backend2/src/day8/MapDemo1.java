package day8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import day7.Utill;

public class MapDemo1 {
	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		Stream<String> s2 = s1.map(String::toUpperCase);
		s2.forEach(Utill::print);

		s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		Stream<String> s3 = s1.map(x -> x.substring(1));
		IntStream s4 = s3.mapToInt(Integer::valueOf); // 아스키 값 (-48) 해주면 됨.
		s4.forEach(Utill::print);

		// Char 값을 정수로 변경 시 아스키 코드로 변경 된다.

	}

}
