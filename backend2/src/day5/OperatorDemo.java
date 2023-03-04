package day5;

import java.util.Objects;
import java.util.function.IntUnaryOperator;

public class OperatorDemo {
	public static void main(String[] args) {

		
		IntUnaryOperator io = operand -> operand+2;
		io.applyAsInt(10);
		
//		   default IntUnaryOperator andThen(IntUnaryOperator after) {
//		        Objects.requireNonNull(after);
//		        return (int t) -> after.applyAsInt(applyAsInt(t));
//		    }
		IntUnaryOperator after = x-> x*2;

		IntUnaryOperator io2 = io.andThen(x-> x+100);
		
		System.out.println(io2.applyAsInt(10));
		
	}
}
