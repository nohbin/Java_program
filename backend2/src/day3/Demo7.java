package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo7 {
	public static void main(String[] args) throws IOException {

		int dividend = 10;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int divisor = Integer.parseInt(br.readLine());
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재 하지 않습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다");
		} catch (ArithmeticException e) {
			System.out.println("0 으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료");
		
		
	}
}
