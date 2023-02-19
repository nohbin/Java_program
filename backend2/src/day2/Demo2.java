package day2;

public class Demo2 {
	
	private static String makeComma(long number) {
		String num = String.valueOf(number);
	String str = "";
	int count = 1;
		for (int i = num.length()-1; i >-1; i--) {
			str += num.charAt(i);
		
			if(count %3 == 0 ) {
				
				str += ",";
			}
		count++;
			
		}
		System.out.println(str);
		String str2="";
		for (int i = str.length()-1; i> -1; i--) {
			str2 += str.charAt(i);
		}
		
		return str2;
		
	}
	public static void main(String[] args) {

		long num = 1351324;
		
		System.out.println(num);
			
		String a = num+"";
		String b = String.valueOf(num);
		String c = "";
		
		//System.out.println(b.charAt(0));
		
		int lastIndex = b.length()-3;
		
	

		
		
		
	String str = "";
	int count = 1;
		for (int i = b.length()-1; i >-1; i--) {
			str += b.charAt(i);
		
			if(count %3 == 0 ) {
				
				str += ",";
			}
		count++;
			
		}
		System.out.println(str);
		String str2="";
		for (int i = str.length()-1; i> -1; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
	}
}
