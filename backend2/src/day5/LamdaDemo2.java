package day5;

interface Printable{
	void print(String str);
}

public class LamdaDemo2 {
	public static void main(String[] args) {

		Printable p;
		
		p=(str) -> System.out.println(str);
//		p=() -> System.out.println("def");
//		p=() -> System.out.println("Abc");
		p.print("hello");
		
	}
}
