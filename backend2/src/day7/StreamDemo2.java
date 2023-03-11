package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo2 {
	public static void main(String[] args) {

		// Stream 방식으로 필터 (조건) - 출력

		// 로또번호 생성기.
		// 랜덤하게 생성한 번호 중 중복?

		List<Integer> lists = new ArrayList<>();

		
		int[]ary = IntStream.iterate(1, x -> x + 1).limit(45).toArray();
		// 배열을 list 로 변환
		IntStream is = Arrays.stream(ary);
		
		
		List<IntStream> c = Arrays.asList(is);
		Collections.shuffle(c);
		System.out.println(c);
	
	
		// lists.forEach(x->System.out.print(x + " "));

		//lists.subList(0, 6).forEach(x -> System.out.println(x + " "));

	}
}
