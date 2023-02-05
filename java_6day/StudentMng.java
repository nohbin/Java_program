package java_6day;

/*
 
 * 학생관리클래스 : 
 * 변수 - 학생들(배열로 관리) - 15 max
 * 메소드 - 학생들의 정보를 전부 출력
 *    
 * 
 */
public class StudentMng {

	int maxClass = 15;
	Student[] students = new Student[15];
	// 객체 students 는 초기화로 null 상태.
	int currentPos = 0;

	void makeClass(Student s) // 1. 배열에 정보 넣기.
	{
		if (currentPos + 1 > maxClass) {
			System.out.println("클래스의 정원을 넘어섰습니다(15명).");
			return;
		}
		students[currentPos++] = s;
	}

	void showClass() { // 전체 정보 출력
		System.out.printf("이름\t국어\t영어\t수학\t평균\t학점\n");
		for (int i = 0; i < students.length; i++) {
			students[i].studentInfo();
		}
	}

}
