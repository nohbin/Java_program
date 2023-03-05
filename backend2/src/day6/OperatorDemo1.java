package day6;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/*
 * 
 *  <? supter T> 에 대해서 한번 알아봅시다.
 */


public class OperatorDemo1 {

	public static void main(String[] args) {
		
		
		
		Comparator<Integer> comparator = (a,b) -> a+b;
		BinaryOperator<Integer> a= BinaryOperator.maxBy(comparator);
		BinaryOperator<Integer> b= BinaryOperator.minBy(comparator);
		
		System.out.println(	a.apply(10, 20));
		System.out.println(	b.apply(10, 20));
		
	}
}
