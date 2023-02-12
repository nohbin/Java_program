package java_8day;

class Gender{
	
	public static final String  MALE = "Male";
	public static final String FEMALE = "Female";
	
	
}

enum GenderE{M,F}


public class Enum1 {

	
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		System.out.println(GenderE.F);
	GenderE a = GenderE.M;
		
	switch (a) {
	case F:
		
		break;
	case M:
		
	default:
		break;
	}
	}
}
