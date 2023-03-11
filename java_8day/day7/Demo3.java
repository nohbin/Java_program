package day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import day7.Demo3.Gender;

public class Demo3 {
	static int i = 0;
	enum Gender{MALE ,FEMALE}
	
	public static void main(String[] args) {

		Stream<String> ss;
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.MALE, Gender.FEMALE, Gender.MALE, Gender.MALE, Gender.MALE, Gender.FEMALE);
		
      
       Stream<Member> sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
       sm.forEach(x->System.out.println(x));
       
       i=0;
       // Male 만 출력
       sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
       sm.filter(x->x.getGender() == Gender.MALE).forEach(x->System.out.println(x));
       
       i=0;
//      나이가 평균보다 높은 사람.
       sm = names.stream().map(x-> new Member(x, genders.get(i), ages.get(i++)));
       IntStream is = ages.stream().mapToInt(x->x.intValue());
       int avg = (int) is.average().getAsDouble();
       sm.filter(x-> x.getAge()>avg).forEach(x->System.out.println(x));
       
      
	}
}

class Member{
	private String name;
	private day7.Demo3.Gender gender;
	private int age;
	
	public Member(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}

	public day7.Demo3.Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
