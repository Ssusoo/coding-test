package _2.array._3;

import java.util.Scanner;

/**
 * 3th, 가위바위보(IfElseIfElse)
 *
 * 1. 설명
 *  A, B 두 사람이 가위바위보 게임을 한다. 총 N번의 게임을 해
 *  A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
 *  비길 경우에는 D를 출력한다. 두 사람의 각회의 가위바위보 정보가 주어지면
 *  각회를 누가 이겼는지 출력하는 프로그램
 *
 * 2. 입력 설명
 *  첫 번째 줄에 게임 횟수인 자연수 N이 주어진다.
 *  두 번째 줄에는 A가 낸 가위바위보 정보가 N개 주어진다.
 *  세 번째 줄에는 B가 낸 가위바위보 정보가 N개 주어진다.
 *
 * 3. 출력설명
 *  각 줄에 각호의 승자를 출력한다.
 *  비겼을 때 D를 출력한다.
 *
 * 4. 입력예제 5,  A : 2 3 3 1 3, B : 1 1 2 2 3 출력예제 A B A B D
 *
 * 5. 생각정리
 *  1-1) 게임 횟수로 for문의 끝자리 세팅해주기
 *      -> i < n;
 *      -> 그래야 조건문을 통해 arrA[i]와 arrB[i]의 값을 비교할 수 있다.
 *  1-2) 리턴 타입은 type 정하기
 *      -> A B A B B D String 반환하기
 *  1-3) For문으로 데이터 출력
 *      -> 입력한 데이터가 잘 뽑히는지 확인
 *  1-4) 조건문(A나 B 중에서 한쪽으로 기준을 세우기)
 *      -> 비길 때를 제외한 나머지는 A가 이길 수 있는 경우의 수를 세팅하기
 *      -> 리턴 값을 누적시키기
 *      -> 나머지는 else를 통해 B가 이기게 한다.
 */
public class IfElseIfElse {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];

		for (int i = 0; i < n; i++) {
			arrA[i] = kb.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arrB[i] = kb.nextInt();
		}

		IfElseIfElse main = new IfElseIfElse();
		System.out.println(main.solution(n, arrA, arrB));
	}

	private String solution(int n, int[] arrA, int[] arrB) {
		// 1-1) 리턴 타입은 type 정하기
		String answer = " ";

		// 1-2) For문으로 데이터 출력 조회
		for (int i = 0; i < n; i++) {
			// 1-3) 데이터 출력 하기
			System.out.print(arrA[i] + " ");
			System.out.println();
			System.out.print(arrB[i] + " ");

			// 1-4) A와 B가 비길 경우
			if (arrA[i] == arrB[i]) answer += "D";
			// 1-5) 가위로 A가 이길 경우
			else if (arrA[i] == 1 && arrB[i] == 3) answer += "A";
			// 1-6) 바위로 A가 이길 경우
			else if (arrA[i] == 2 && arrB[i] == 1) answer += "A";
			// 1-7) 보로 A가 이길 경우
			else if (arrA[i] == 3 && arrB[i] == 2) answer += "A";
			// 1-8) B가 이길 경우
			else answer += "B";
		}
		return answer;
	}
}