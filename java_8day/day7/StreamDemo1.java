package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo1 {
	
	public static void main(String[] args) {

		// 리스트를 생성
		
		List<Integer> lists = new ArrayList<>();
		
		Random r = new Random();
		// 해당 리스트의 랜덤한 정수형 값을 저장 10개		
		// 위에서 저장한 리스트 중에서 값이 10 이상인 데이터만 새로운 리스트에 저장
		// 정렬 하고 출력
		
		for (int i = 0; i < 11; i++) {
			lists.add(r.nextInt(30));
		}
		List<Integer> lists2 = new ArrayList<>();

	
		for (Integer data : lists) {
			if(data>=10) {
				lists2.add(data);
			}
		}
		Collections.sort(lists2);
		System.out.println(lists2);
		
		// Stream 방식으로 바꾼뒤 사용.
		 lists.stream()
		 .filter(x-> x>=10)
		 .sorted()
		 .forEach(x->System.out.print(x +" "));
		
	
		 
		
		
		
	}
}
