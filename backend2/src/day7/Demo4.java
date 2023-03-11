package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Stream
 * Collection 과 비슷한 기능을 제공하지만 주로 람다를 이용하여 커스텀화 할수 있다.
 * 버퍼링 처럼 자료를 저장하지 않고 즉시 처리가 가능하다.
 */

public class Demo4 {
	public static void main(String[] args) {
		
		/*
		 * 랜덤하게 1~100 까지 숫자 중 20개를 선택
		 * 짝수만 출력
		 * 홀수만 출력
		 */
		
		Random r= new Random(101);
		List<Integer> lists = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			lists.add(r.nextInt(101));
		}
		System.out.print(lists + " ");
		
		lists.stream().filter(x->x%2==0).sorted().forEach(x->System.out.println(x + " "));
		lists.stream().filter(x->x%2!=0).sorted().forEach(x->System.out.println(x+ " "));
		lists.stream().filter(x->x%3==0).sorted().forEach(x->System.out.println(x+ " "));
		
		
		
		
	}
}
