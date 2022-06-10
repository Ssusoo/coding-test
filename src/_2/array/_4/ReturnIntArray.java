package _2.array._4;

import java.util.Scanner;

/**
 * 4th, 피보나치 수열(ReturnIntArray)
 *
 * 1. 설명
 *  피보나치 수열을 출력한다. 피보나치수열이란 앞의 2개의 수를 합해 다음 숫자가 되는 수열이다.
 *  입력은 피보나치 수열의 총합의 수다. 만약 7이 입력되면
 *  1 1 2 3 5 8 13 출력하면 된다.
 *
 * 2. 입력설명
 *  첫 줄 총 항수 N이 입력된다.
 *
 * 3. 출력설명
 *  첫 줄에 피보나치 수열을 출력함.
 *
 * 4. 입력예제 10 출력예제 1 1 2 3 5 8 13 21 34 55
 *
 * 5. 생각정리
 *  5-1) int type으로 입력값받기
 *  5-2) 로직 구현 메소드에서 리턴 type을 배열로 하고
 *  5-3) index[0]과 index[1]의 고정값으로 1로 세팅해주기
 *  5-4) for문의 시작은 int = 2부터.
 *  5-5) 피보나치 세팅하기
 *      -> index[2] = index[0] + index[1]이기 때문에
 *      -> index[2] = index[i-2] + index[i-1].
 */

/**
 *  1. 해결방법
 *      1-1) int type으로 입력값받기
 *      1-2) Int로 받아 하나의 배열 형태로 출력
 *      1-3) 리턴 type 결정하기
 *          -> 로직 구현 메소드에서 리턴 type을 배열로 하고
 *      1-4) index[0]과 index[1]의 고정값으로 1로 세팅해주기
 *      1-5) 피보나치 세팅하기(출력값이 나올 수 있도록)
 */
public class ReturnIntArray {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// 1-1) int type으로 입력값받기
		int n = kb.nextInt();

		ReturnIntArray main = new ReturnIntArray();

		// 1-2) Int로 받아 하나의 배열 형태로 출력
		for (int x : main.solution(n)) System.out.print(x + " ");
	}

	private int[] solution(int n) {
		// 1-3) 리턴 type 결정하기
		int[] answer = new int[n];

		// 1-4) index[0]과 index[1]의 고정값으로 1로 세팅해주기
		answer[0] = 1;
		answer[1] = 1;

		// 1-4) for문의 시작은 int = 2부터.
		for (int i = 2; i < n; i++) {
			// 1-5) 피보나치 세팅하기(출력값이 나올 수 있도록)
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
}