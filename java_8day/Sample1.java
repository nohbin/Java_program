package java_8day;

/*
 * 객체가 매개변수로 전달 되는 test
 * 함수를 만들어 매개변수를 전달 받아 
 * 결과를 매개변수로 셋팅 하는 함수
 * 리턴 타입이 void 인 함수
 * 
 * 	// type = 1 더하기
		// 2일때 다 빼고
		//3 일때 다 곱하기
		//4 나누기
 */


public class Sample1 {
	
	enum CALC  { SUM , SUB , MUL , DIV};

	public static void getResult(int type, int[] result, int... a) {

		int sum = 0;
		int sub = 0;
		int mul = 1;
		int div = 0;
		if (type == 1) {
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			result[0] = sum;
		} else if (type == 2) {
			for (int i = 0; i < a.length; i++) {
				sub -= a[i];
			}
			result[0] = sub;
		} else if (type == 3) {
			for (int i = 0; i < a.length; i++) {
				mul *= a[i];
			}
			result[0] = mul;
		}else if (type ==4) {
			for (int i = 0; i < a.length; i++) {
				div = a[i]/a.length;
			}
			result[0] = div;
		}

	}
	
	

	public static void main(String[] args) {
		
		
		int type = 3;
		int[] result = new int [1];
		getResult(type, result, 1,2,3,4,5,6,7,8,9,10);
		System.out.println(result[0]);

	}

}
