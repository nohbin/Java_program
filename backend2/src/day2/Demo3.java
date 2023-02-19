package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Coupleling
 * 
 * 
 */

public class Demo3 {
	public static void main(String[] args) {
		
		//ArrayList<Integer> ary = new ArrayList<>();
		
		List<Integer> ary = new ArrayList<>();
		
		
		
		A a = new A();
		ABC b = new ImplABC();

		
		// 다형성 으로 인하여
		a.display(b);
		a.displayCoupling(new ImplABC());

	}
}
