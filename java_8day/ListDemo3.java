package java_8day;

import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo3 {
	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {
			arr.add((int) ((Math.random() * 20) + 1));
		}
		System.out.println(arr);
		int sum = 0;
		for (Integer integer : arr) {// 읽기만 가능 무조건 순환 하며 사용

			sum += integer;
			if (integer > 10) {
				System.out.print(integer + ", ");
			}
		}

	}
}
