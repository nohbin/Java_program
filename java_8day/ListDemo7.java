package java_8day;

import java.util.Scanner;

public class ListDemo7 {
	// 가변매개변수 : 매개변수가의 갯수가 정해지지 않고 사용자가 입력하는대로 사용.
	
	
	// 원인 ?  
	// 분석 :
	// 해결 !
	
	
	public static int sum(int...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
		System.out.println(sum(2,3,4,3245,345,346,3467,4574));
		
		
	}

}
