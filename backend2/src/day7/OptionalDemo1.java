package day7;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo1 {
	
	public static OptionalDouble divde(double x , double y) {
		return y==0 ? OptionalDouble.empty() : OptionalDouble.of(x/y);
	}
	public static void main(String[] args) {

		OptionalInt i =	OptionalInt.of(100);
		OptionalDouble d = OptionalDouble.of(3.14);
		Optional<String> s = Optional.of("Apple");
		
		System.out.println(i.getAsInt());
		System.out.println(d.getAsDouble());
		System.out.println(s.get());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println(divde(1.0, 0.0));
		
		
	}
}
