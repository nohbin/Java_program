package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EntryDemo3 {

	public static void main(String[] args) {
		
		/*
		 * Map 의 객체가 만들어질때 for 문 안에 존재하는것 과 밖에 존재하는 값은 매우 다르다.
		 * 
		 */

		

		List<Map<String, Integer>> lists = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			Map<String, Integer> maps = new HashMap<>();
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("점수 : ");
			int jumsu = sc.nextInt();
			maps.put(name, jumsu);
			System.out.println("-----------");
			System.out.println(maps);
			System.out.println("-----------");
			
			lists.add(maps);
			System.out.println(lists);
		}
		sc.close();
		

		
		System.out.println(lists);

	}
}
