package day5;

interface MatheMatical {
	double calculate(double b);
}

interface Pickable {
	char pick(String s, int i);
}

interface Computable {
	int compute(int x, int y);
}

class Utills {
	int add(int a, int b) {
		return a + b;
	}
}

public class LamdaDemo3 {
	public static void main(String[] args) {
		
		MatheMatical m;
		Pickable p;
		Computable c;
		
		m = b -> (b>0) ? b:-b;
		m = b -> Math.abs(b); // 람다식 기능을 구현 (기존 Math.abs()) 를 이용한
		//------------------------------------------------------------
		m= Math::abs; // 기존 Math abs 함수를 m 으로 치환. ** 정적 메서드 참조
		m.calculate(-10.3);
		
		String a = "ABC";
		
		p = (s, i) -> s.charAt(i);
		p=String::charAt;
		System.out.println(p.pick("Sung", 1));
		
		c = (x, y) -> x+y;
		Math.addExact(0, 0);
		c=Math::addExact;
		c.compute(10, 20);
		System.out.println(c);
		
		Utills u = new Utills();
		u.add(10, 10);
		c = (x, y) -> u.add(x, y);
		c= u::add; // add 메소드가 static 일시 클래스명으로 불러야 하며 없을 시 객체명으로 불러올 수 있다. ** 인스턴스 메서드 참조
	
		

	}
}
