package java_8day;

import java.util.Scanner;


public class ListDemo1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		// 0 이상 의 숫자 만 입력 한 데이터를 저장, 
		// 만약 음수 입력시 중지
		// 입력한 데이터를 모두 저장하시오.평균과 합을 구하시오.
		int [] ary = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();
			if(ary[i] <0) {
				break;
			}
			sum+=ary[i];			
		}
		avg = (double)sum/ary.length;
		
		System.out.printf("총 합은 %d 이며 평균은 %f 이다.\n",sum,avg);
		System.out.println("-".repeat(20));

		
	
	}
	
}
