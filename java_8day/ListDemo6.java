package java_8day;

public class ListDemo6 {
	
	//	0으로 나눌 수 없다
	// 	0이 아닐때는 리턴 값 a/b
	// 	만약 0 이 들어오면 정상으로 나눈값인지 예외처리 한 값인지.
	//	정상이면 정상값을 리턴
	//	오류 일시 오류라는 정보를 리턴
	
	
	public static boolean divide(int a, int b,double[] result ) {
		
		if (b == 0) {
			return false;
		}else {
			result[0] = (double)a/b;
			return true;
		}		
	}

	public static void main(String[] args) {
		double[] result = {0.0};
		if(!divide(10, 3, result)) {
			System.out.println("by zero....");
		return;
		}
		System.out.println("result = " +result[0]);
	}
}
