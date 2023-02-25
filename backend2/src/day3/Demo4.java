package day3;

import java.util.Scanner;



public class Demo4 {

	
	public static void test() throws ArithmeticException {
		Scanner sc = null;
		try{
			sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			String number = sc.next();
			int num = Integer.valueOf(number);
			System.out.println(10/num);
			
			
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
				
			}
//		finally {
//				sc.close();
//			}
	}
	public static void main(String[] args) {
		
//		int[]a = new int[3];
//		
//		System.out.println(a[3]);
//		
//		System.out.println("abc");
//		System.out.println("abc");
//		System.out.println("abc");
		
		test();
		System.out.println("Program end");
		
		
	}
}
