package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	
	private static String makeComma(long number) {
		String num = String.valueOf(number);
	String str = "";
	int count = 1;
		for (int i = num.length()-1; i >-1; i--) {
			str += num.charAt(i);
		
			if(count %3 == 0 ) {
				
				str += ",";
			}
		count++;
			
		}
		System.out.println(str);
		String str2="";
		for (int i = str.length()-1; i> -1; i--) {
			str2 += str.charAt(i);
		}
		
		return str2;
		
	}
	
	private static int showMenu() {
		System.out.println("다음 메뉴를 선택하세요");
		System.out.println("1. 입장객 등록");
		System.out.println("2. 수입");
		System.out.println("3. 종료");
		return (new Scanner(System.in)).nextInt();
		
	}
	
	private static void showPerson() {
		System.out.println("1. 어른 : ");
		System.out.println("2. 청소년 : ");
		System.out.println("3. 어린이 : ");
		System.out.println("4. 이전으로");
	}
	
	private static void processChoicePerson(ArrayList<Person> lists) {
		int choice = 0;
		while(choice !=4) {		
		showPerson();
		choice = (new Scanner(System.in)).nextInt();	
		if(choice == 1) {
			lists.add(new Adult());		
		}else if(choice ==2) {
			lists.add(new Teenager());
		}else if(choice ==3) {
			lists.add(new Children());
		}
		long totalPrice = 0; // 총수입 
		for (Person person : lists) {
			totalPrice += person.getPrice();
		}
		//System.out.println(totalPrice);
		}
	
	}
	

		
	public static void main(String[] args) {
		ArrayList<Person> lists = new ArrayList<Person>();
		
	
		
		int choice = showMenu(); // 최초 메뉴 선택
		if(choice ==3) return; // 3번 선택시 종료
		
	
		while(choice == 1) { // 입장객 선택 메뉴판
			processChoicePerson(lists); // 입장객 선택 이전 메뉴 선택 시 종료
			choice = showMenu();
			if(choice ==3) return; // 메인메뉴 선택 호출. 다시 입장객 선택시 순환
			
		}
		
		if(choice == 2) { // 메뉴에서 2번 선택시 가능
			System.out.println("총수입을 산출합니다.");
			long totalPrice = 0; // 총수입 
			for (Person person : lists) {
				totalPrice += person.getPrice();
			}
			System.out.printf("입장인원\t어른\t청소년\t어린이\t총 수입\n");
			System.out.printf("%d\t%d\t%d\t%d\t%s\n",Person.getCount(),Adult.getCount(),Teenager.getCount(),Children.getCount(),makeComma(totalPrice));
			
			
		}

		
	
		

		
		
		
		
		
		
		
	}

}
