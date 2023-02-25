package day3;

import java.util.StringTokenizer;

/*
 *  Runtime Exception
 *  컴파일 실행 시 exception 이 발생
 */

public class Demo5 {

	public static void main(String[] args) {
		
		String s = "Time is Money";

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	//	System.out.println(st.nextToken());  // noSuchElementException
		
		int[]ary = {1,2,3};
		//System.out.println(ary[3]); // outOfboundException
		
		
		
	}
}
