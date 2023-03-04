package solo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  고객 관리 프로그램.
 *  Map 번호 당 customer 관리,
 *  1번부터 시작.
 *  기본 등급 GENERAL 부터 시작, 금액 충족 시 VIP TOP 로 등급 UP
 *  
 *  23.2.27 -
 *  1. 고객정보 등록 시 map 값이 1로 초기화 됨. / 전역변수 로 변경 완
 *	2. 뒤로가기 후 메뉴 실행 시 작동 불가.	/ main 실행 문 수정으로 변
 * 	3. 고객 번호 출력 (?) / 전역변수 로 둔 고객 값 출
 * 	
 *  23.3.2 -
 *  1. 고객누적 적립금 오류 / Customer class 객체 수정 완료
 *  
 */

public class Demo  {
	
	private static int customersNum = 1; // 고객 관리 번호 , 전역변수로 고객등록 메소드 추가시 지속 증가
	
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		Map<Integer, Customer> customers = new HashMap<>();

		

		int menuNum = chooseMenu(sc);
	//	if (menuNum == 4) return; // 메뉴 4번선택시 종료
		
		while (menuNum != 4) {
			if(menuNum ==1) {
			setCustomerInfo(sc,customers, menuNum);
			menuNum = chooseMenu(sc);
			} else if (menuNum == 2) {
				modCustomInfo(sc, customers, menuNum);
				menuNum = chooseMenu(sc);
			} else if( menuNum ==3) {
				showCustomInfo(sc, customers, menuNum);
				menuNum = chooseMenu(sc);
			}
			
		}
		

	}

	public static int chooseMenu(Scanner sc) {
		System.out.println("---- 고객 관리 시스템 ------");
		System.out.println("1. 고객정보 등록");
		System.out.println("2. 고객정보 수정");
		System.out.println("3. 고객정보 출력");
		System.out.println("4. 나가기");

		int menuNum = sc.nextInt();
		
		return menuNum;
	}

	public static void setCustomerInfo(Scanner sc , Map<Integer, Customer> customers, int menuNum) {// 고객 정보 입력
		
		
		boolean done = false;

		while (!done) {
			Customer cs = new Customer();
			System.out.println("이름을 입력하세요 : (종료를 원하시면 exit를 입력해주세요.)"); // 고객이름 입력 및 탈출 문
			cs.setName(sc.next());
			if (cs.getName().equals("exit")) {
				done = true;
				break;
			}
			cs.setGrad(new General()); // 기본 등급 general 부터 시작;
			System.out.println("금액을 입력하세요 : "); // 고객 금액 등록
			cs.setTotalPrice(sc.nextInt());
			if (cs.getTotalPrice() > 1000000) {
				cs.setGrad(new Top());
			} else if (cs.getTotalPrice() > 500000) {
				cs.setGrad(new VIP());
			} else {
				cs.setGrad(new General());
			}
			cs.setRewardPrice(); // 적립금액 계산 문 // 등급별 차등 적립.
			customers.put(customersNum++, cs); // Map 에 번호 , 고객 등록.
		}
	}

	public static int showCustomInfo(Scanner sc, Map<Integer, Customer> customers, int menuNum) { // 고객 번호 별 고객 출력	
		boolean done = false;
		int customersNum;
		while (!done) {
			
			System.out.println(" ---- 고객 확인 메뉴 -----");
			System.out.println(" 확인을 원하는 고객 번호를 입력하세요.\n(종료를 원하시면 0번을 입력해주세요");
			System.out.println(customers);
			customersNum = sc.nextInt();

			if (customersNum == 0) {
				System.out.println("종료문 실행");
				done = true;
				break;
			} else {
				Customer customer = customers.get(customersNum);
				if (customer != null) {
					System.out.println(customer);
				} else {
					System.out.println("고객 번호 " + customersNum + "에 해당하는 고객이 없습니다.");
				}
			}
		}

		return menuNum;
	}

	public static int modCustomInfo(Scanner sc, Map<Integer, Customer> customers, int menuNum) { // 고객 이름 정보 변경 문

		boolean done = false;
		
			while (!done) {
				System.out.println(" ---- 고객 정보 수정 메뉴 ---- ");
				System.out.println("1. 고객 이름 변경.\n2. 고객 금액 변경\n3. 종료를 원하시면 0번을 입력해주세요.");
				int customerNum = sc.nextInt();
				if (customerNum == 0) {
					done = true;
					break;
				}else if(customerNum == 1) { // 고객 이름 변경
					System.out.println("변경을 원하시는 고객 번호를 입력해주세요.");
					System.out.println(customers);
					
					Customer cs = customers.get(sc.nextInt());

					System.out.println("새로운 이름을 입력하세요 : ");
					String newName = sc.next();
					cs.setName(newName);

					System.out.println("변경 후 고객 정보입니다. : ");
					System.out.println(cs);

				} else if(customerNum==2) { // 추가 금액 입력 문 , 추가 금액 합산 후 등급 재 설정
					System.out.println(customers);
					System.out.println("고객번호를 입력해주세요.");
					
					Customer cs = customers.get(sc.nextInt());
					
					System.out.println("추가 금액을 입력해주세요.");
					cs.setAddPrice(sc.nextInt());
					
					System.out.println("변경 후 고객 구매 금액 입니다.");
					System.out.println(cs.getTotalPrice());	
					
					if (cs.getAddPrice() > 1000000) {
						cs.setGrad(new Top());
					} else if (cs.getAddPrice() > 500000) {
						cs.setGrad(new VIP());
					} else {
						cs.setGrad(new General());
					}
				}			
			}
		
		return menuNum;
	}
}
