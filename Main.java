package baekjun;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] b = new int[a];
		int max = b[0];
		int avg = 0;

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) { // 최대값 찾기
			if (b[i] > max) {
				max = b[i];
			}
		}

		for (int i = 0; i < b.length; i++) { // 성적 점수/최대값 * 100

			System.out.println("나누기 전 최대값"+max);
			b[i] = ((b[i] / max) * 100);
			System.out.println(b[i]);
		}


		
		for (int i = 0; i < b.length; i++) {
			avg += b[i] / a;

		}
		System.out.println(avg);

	}

}
