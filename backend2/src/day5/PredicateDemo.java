package day5;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

		Predicate<Integer> p = x -> x >= 0;
		int[] arr = {
				-8,2,5,-9,2
		};
		for (int i : arr) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
		Consumer<String> c = x -> System.out.println(x.toLowerCase());  
		
		c.accept("ABC");
		BiConsumer<String, String> bc = (a,b) -> System.out.println(a+b); 
		
		bc.accept("A", "B");
		
		
//		  default IntConsumer andThen(IntConsumer after) {
//		  Objects.requireNonNull(after);
//		  return (int t) -> { accept(t); after.accept(t); };
//		  }
		IntConsumer ic = x -> System.out.println("ha");;;
		 ic.andThen(x->System.out.println(x*10));
		
		ic.accept(10);
		
		
	}
}
