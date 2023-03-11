package day7;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraytoStreamDemo1 {
	public static void main(String[] args) {
		
		int[]arr = {1,3,4,3,1,2};
		
		// int 배열을 intStream 으로 받는 방법.
		IntStream is = Arrays.stream(arr);
		IntStream is2 =  IntStream.of(arr);
		
		System.out.println(is.average().getAsDouble());
		
		String[] strs = {"aa", "bb", "aa", "dd", "bb"};
		Stream<String> ss = Stream.of(strs);
		
		// stream 문을 계속 쓸시 반환 값이 stream 으로만 가능
		
		ss.distinct().forEach(x->System.out.print(x + " "));
		
		IntStream is1 = IntStream.iterate(1, x-> x+2); // 무한히 2씩 증가.
	//	is1.forEach(x->System.out.println(x));
		
		IntStream is3 = new Random().ints(0,10);
		is3.forEachOrdered(x->System.out.println(x));
	
		
		
	}
}
