package _2.array._7;

import java.util.Scanner;

/**
 * 7th, 점수계산
 * 1. 설명
 *  OX 문제는 맞거나 틀린 두 경의 답을 가지는 문제를 말한다.
 *  여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는
 *  가산점을 주기 위해서 다음과 같이 점수를 계산하기로 했다.
 *  1번 문제가 맞는 경우에는 '1점'으로 계산한다.
 *  연속적으로 맞힌 경우에는 두 번째 문제는 '2점', 세 번째 문제는 3점.
 *  틀린 문제는 0점으로 계산.
 *
 * 2. 입력설명
 *  첫 번째 줄에는 문제의 갯수,
 *  두 번째 줄에는 N개 문제의 채점 결과제를 나타내는 0혹은 1.
 *
 * 3. 출력설명
 *  첫 번째 줄에 입력에서 주어진 채점 결과에 대해 가산점을 고려한 총 점수를 출력한다.
 *
 * 4. 입력예제 10, 1 0 1 1 1 0 0 1 1 0          출력예제 10
 */
public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String str = kb.next();

		Main main = new Main();

		System.out.println(main.solution(str));
	}

	private boolean solution(String str) {
		return false;
	}
}
