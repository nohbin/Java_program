package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListDemo1 {
	public static void main(String[] args) {

		String[] animals1 = { "Dog", "Bird", "Cat" };

		List<String> animals2 = Arrays.asList(animals1);

//		animals2.forEach(x-> System.out.println(x));
//		animals2.add("Nohbin");
//		animals2.forEach(x-> System.out.println(x));

		// 배열에서 변환한 list 는 추가가 안됨;

		List<String> animals3 = new ArrayList<>(animals2);

		animals3.add(1, "Human");
		//animals3.forEach(x -> System.out.println(x));

		// 문자열 길이 기준으로 정렬

		animals3.sort((a, b) -> -1);

		animals3.forEach(x-> System.out.println(x));
		String[]str = {"abc"};
		
		Stream<String>result = Arrays.stream(str).sorted(Comparator.reverseOrder()).toArray();
		
		
		
		
		
	}
}
