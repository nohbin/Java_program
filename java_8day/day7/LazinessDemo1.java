package day7;

import java.util.stream.IntStream;

public class LazinessDemo1 {
	public static void main(String[] args) {

		// filter 나 map 은 느린 처리로 출력문이 있어도 빠른 처리문을 만나기 전까지 실행되지 않는다.
		IntStream is = IntStream.rangeClosed(1, 5); // 1과 5를 포함하는 정수
		is.filter(x -> {
			System.out.println("filter : " + x);
			return x % 2 == 0;
		}).map(x -> {
			System.out.println("Map : " + x);
			return x * x;
		}).forEach(x -> System.out.println("For each : " + x));
		
	}
}
