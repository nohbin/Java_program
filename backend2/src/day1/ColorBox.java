package day1;

public class ColorBox extends Box {

	public ColorBox() {
		//super();// 부모의 기본생성자가 호출되어 있는 문장 이 숨겨져있다.
		this(0); // ColorBox 의 매개변수 생성자를 호출한다.		
	}
	
	public ColorBox(int a){
		//super(); // 생략되어 있는 생성자
		super(a);		
	}
	
}
