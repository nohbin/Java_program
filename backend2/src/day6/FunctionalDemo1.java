package day6;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionalDemo1 {
	public static void main(String[] args) {

		Function<Integer, Integer> add = x -> x+2;
		Function<Integer, Integer> mul = x -> x*2;
		
		add.andThen(mul).apply(3); // 10
		// 3에 add 를 한 뒤 mul 을 함
		
		System.out.println(add.compose(mul).apply(3)); // 8
		// 3에 mul 을 먼저 한 뒤 add 가 들어감.
		
		
		IntToDoubleFunction half = x -> x/2.0;
		System.out.println(half.applyAsDouble(3));
		
		ToDoubleBiFunction<String, Integer> goo = 
				(a,b) -> Double.parseDouble(a)*b*b;
		System.out.println(goo.applyAsDouble("3.14", 10));
	}
}
