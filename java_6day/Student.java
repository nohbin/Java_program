package java_6day;

import java.util.Scanner;

/*
 * 1. 요구사항 분석
 * 반 단위로 학생은 3개의 과목 수강(국영수)
 * 반의 정원은 15명 내외로 한다
 * 학생은 수강과목,이름,반에대한 성적(학점), 평균 을 갖는다.
 * 석차를 갖는다 , 반에 있는 모든 학생을 적절하게 정렬한다. == 보류
 * 
 * 2. 설계
 * db , 화면 , 프로그램
 * 프로그램 설계(쉐도우코드) , 순서작성
 * 
 * 학생클래스 : 
 * 변수 - 이름 , 배열(국영수) , 성적 , 평균 , 
 * 메소드 - 평균 구하기 ,성적 구하기 , 학생정보 출력
 * 

 * 
 */
public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int[] scores = new int[3];
	String grad;
	double avg;

	void inputData() { // 정보 입력 이름 점수
		System.out.println("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		scores[0] = sc.nextInt();
		System.out.print("영어 : ");
		scores[1] = sc.nextInt();
		System.out.print("수학 : ");
		scores[2] = sc.nextInt();
		getMean();
		calcGrade();
		
	}

	double getMean() { // 평균 구하기
		int sub = 0;

		for (int i = 0; i < 3; i++) {
			sub += scores[i];
		}
		avg = (double) sub / scores.length;
		return avg;
	}

	String calcGrade() { // 등급 구하기
		// 1. 평균을 구한다.
		// 2. 평균을 가지고 각 학점에 해당하는 구간 파악
		// 3. 학점 grad 변수에 입력

		double avg = getMean();
		if (avg >= 90)
			grad = "A";
		else if (avg >= 80)
			grad = "B";
		else if (avg >= 70)
			grad = "C";
		else if (avg >= 60)
			grad = "D";
		else
			grad = "F";
		return grad;
	}

	void studentInfo() { // 정보 출력
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", 
				name, scores[0], scores[1], scores[2], avg, grad);
	}

}
