package java_7day;

public class String2Demo {
public static void main(String[] args) {
	String s1 = new String("Hi,");
	String s2 = new String ("Java");
	
	System.out.println(s1.length()); // 2
	System.out.println(s1.charAt(1)); // i
	
	s1=s2.concat(s2); // s2.concat = JavaJava! = s1 으로 변경
	
	System.out.println(s1.concat(s2)+"!"); // JavaJavaJava!
	System.out.println(s1.toLowerCase()+"!"); // javajava!
	System.out.println(s1.substring(4,8)+"!"); // Java!
	
	String s3= " ";
	System.out.println(s3.isEmpty()); // false
	System.out.println(s3.isBlank()); // true
	String s4="";
	System.out.println(s4.isEmpty()); // true
	System.out.println(s4.isBlank()); // true
	
	String s5 = "*-*";
	System.out.println(s5.repeat(10)); // 10번 반복
	System.out.println(s2.trim().indexOf("v")); // 2 // trim 은 공백을 없애준다.
	
	

}
}
