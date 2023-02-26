package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, String> gradeValue = new HashMap<>();
		Map<String , Map<String, String>> customer = new HashMap<>();
		List<Map<String, Map<String, String>>> lists = new ArrayList<>();	
		
		
		Customer hong = new Customer();
		
		System.out.println("이름을 입력하세요 : ");
		hong.setName(sc.next());
		System.out.println("구매액을 입력하세요 : ");
		hong.setValue(sc.next());
		System.out.println("등급을 입력하세요 : ");
		hong.setGrade(sc.next());
		
		gradeValue.put("등급", hong.getGrade());
		gradeValue.put("구매액", hong.getValue());
		gradeValue.put("이름", hong.getName());
		
		
		customer.put(hong.getName(), gradeValue);
		
		lists.add(customer);
		
		
		System.out.println(lists);
		System.out.println(hong.getReserves());
	
		
		
	}
}
