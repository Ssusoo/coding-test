package array._1;


import java.util.Scanner;

/**
 * 1th, 큰 수 출력하기
 *
 * 1. 설명
 *  첫 번째 입력값을 자연수 N개가 주어지고
 *  다음 줄에 N개의 정수가 입력된다.
 *
 * 2. 출력 설명
 *  자신의 바로 앞 수보다 큰 수만 한줄로 출력 된다.
 *
 * 3. 입력 예제 : 6, 7 3 9 5 6 12 출력 예제 7 9 6 12
 *
 * 4. 생각정리
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < str.length; i++) {
			str[i] = kb.next();
		}

		System.out.println(str);
	}
}
