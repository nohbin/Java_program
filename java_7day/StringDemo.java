package java_7day;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hi java!";
		String s2 = "Hi java!";
		s1 = s2;
		s2 = "abc";

		String s3 = new String("Hi java!");

		String s4 = new String("Hi java!");

//		s4="abc";
//		s3=s4; // 독립적인 주소를 가지고 있어 같은 값을 가르키게 할 수 있다.
		s1 = s3;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);

		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('a'));

		// String 클래스에 제공하는 문자열 비교 메소드

		// int compareTO(String s) 문자열을 사전 순으로 비교해 정수값을 반환한다
		// int compareToIgnoreCase(String s) 대소문자를 무시하고 문자열을 사전순으로 비교한다
		// boolean equals(String s) 주어진 문자열을 s와 현재 문자열을 비교한 후 true/false 를 비교
		// boolean equalsIgnoreCase(String s) 대소문자 무시 하고 true /fasle 반환
	}

}
