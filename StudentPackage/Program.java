package StudentPackage;

import java.util.Scanner;

public class Program {

	Scanner sc = new Scanner(System.in);
	Info[] ar;
	boolean wow = true;

	public void go() {
		System.out.println("학생 수는 ? : ");
		int num = sc.nextInt();
		ar = new Info[num];
		while (wow) {
			menu();
		}

	}

	public void menu() {

		System.out.println("1. 정보 등록 : ");
		System.out.println("2. 점수 확인 : ");
		System.out.println("3. 종료");
		int num = sc.nextInt();

		if (num == 1) {
			setStudent();
		} else if (num == 2) {
			getStudent();
		} else {
			System.out.println("-----End------");
			wow = false;
		}

	}

	private void setStudent() {
		System.out.println("학생 등록");
		for (int i = 0; i < ar.length; i++) {
			Info s = new Info();
			System.out.println("학생의 이름은? : ");
			String name = sc.next();
			s.setName(name);
			System.out.println("학생의 번호는 ? : ");
			int num = sc.nextInt();
			s.setNum(num);
			System.out.println("국어 점수는? : ");
			int kor = sc.nextInt();
			s.setKor(kor);
			System.out.println("영어 점수는? : ");
			int eng = sc.nextInt();
			s.setEng(eng);
			System.out.println("수학 점수는? : ");
			int math = sc.nextInt();
			s.setMath(math);
			s.setAvg((kor + eng + math) / 3);
			s.setTotal(math + eng + kor);
			ar[i] = s;
		}

	}

	private void getStudent() {

		System.out.println("학생의 번호는 ? : ");
		int num = sc.nextInt();
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i].getNum()) {
				System.out.println("이름 : " + ar[i].getName());
				System.out.println("국어점수 : " + ar[i].getKor());
				System.out.println("영어점수 : " + ar[i].getEng());
				System.out.println("수학 점수 : " + ar[i].getMath());
				System.out.println("합계 : " + ar[i].getTotal());
				System.out.println("평균 : " + ar[i].getAvg());
				if (ar[i].getAvg() > 80) {
					System.out.println("합격 입니다.");
				} else {
					System.out.println("재시험 입니다.");
				}

			}
		}
	}

	public static void main(String[] args) {
		Program program = new Program();
		program.go();

	}

}
