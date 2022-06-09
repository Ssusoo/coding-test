package _1.string._10;

import java.util.Scanner;

/**
 * 10th, 가장 짧은 문자 거리(Math.min())
 * 1. 설명
 *  첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어짐.
 *
 * 2. 출력 설명
 *  첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 3. 입력 예제 : teachermode e 출력예제 " 10121012210
 *
 * 4. 전체적인 설명
 *
 *    |0|1|2|3|4|5|6|7|8|9|10|
 *  s |t|e|a|c|h|e|r|m|o|d|e|
 *
 *  왼쪽으로부터 e(target)의 거리를 갈 때 +1 1001 / 0 / 1 / 2 / 3 / 0 / 1 / 2 / 3 / 4 / 0
 *  오른쪽으로부터 e(target)의 거리를 갈 때 +1을 하는데 왼쪽과 오른쪽 중에 가장 짧은 거리로 교체해주기
 */

/**
 *  1. 해결방법
 *      1-1) 리턴 type 정해주기 int[]
 *          -> target으로부터 떨어진 거리를 숫자로 리턴하기에
 *          -> int[]을 사용한다.
 *      1-2) p(거리)를 1000으로 둔다. 문자열의 길이가 100을 넘지 않기 떄문에
 *          -> 첫 문자의 왼쪽 길이는 없음.
 *          -> 거리를 무한으로 크게 놓기 위해 1000으로 둔 거임.
 *      1-3) for문 왼쪽으로부터 떨어진 거리
 *      1-4) 조건문 문자열의 문자(e)와 입력 문자(e)가 같으면
 *          1-4)-1. p 값에 0으로 초기화
 *          1-4)-2. 해당 i 번째 index에 0넣기
 *      1-5) 둘이 같지 않으면
 *          1-5)-1. 1씩 누적시키기
 *          1-5)-2. 리턴[]의 index에 p(거리) 값 넣기
 *      1-6) p(거리) 0으로 초기한 값을 다시 1000으로 바꿔주기
 *      1-7) 오른쪽부터 떨어진 거리로 하돼 왼쪽과 오른쪽 중 가장 작은 값으로 변환
 *      1-8) 둘의 값이 같지 않으면
 *          1-8)-1. 1씩 누적시키기
 *          1-8)-2. 두 개의 값 중에 작은 걸 리턴
 *              -> 1001, 1 중에서 비교하기 때문에 1이 된다.
 */
public class MathMinMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char t = kb.next().charAt(0);

		MathMinMain main = new MathMinMain();
		for (int x : main.solution(str, t)) {
			System.out.print(x + " ");
		}
	}

	private int[] solution(String str, char t) {
		// 1-1) 리턴 type 정해주기 int[]
		int[] answer = new int[str.length()];

		// 1-2) p(거리)를 1000으로 둔다.
		int p = 1000;

		// 1-3) for문 왼쪽으로부터 떨어진 거리
		for (int i = 0; i < str.length(); i++) {
			// 1-4) 조건문 문자열의 문자(e)와 입력 문자(e)가 같으면
			if (str.charAt(i) == t) {
				// 1-4)-1. p 값에 0으로 초기화
				p = 0;
				// 1-4)-2. 해당 i 번째 index에 0넣기
				answer[i] = p;
			// 1-5) 둘이 같지 않으면
			} else {
				// 1-5)-1. 1씩 누적시키기
				p++;
				// 1-5)-2. 리턴[]의 index에 p(거리) 값 넣기
				answer[i] = p;
			}
		}
		// 1-6) p(거리) 0으로 초기한 값을 다시 1000으로 바꿔주기
		p = 1000;
		// 1-7) 오른쪽부터 떨어진 거리로 하돼 왼쪽과 오른쪽 중 가장 작은 값으로 변환
		for (int i = str.length()-1; i >= 0; i--) {
			// 1-7)-1. 조건문 둘의 값이 같으면 0으로
			if (str.charAt(i) == t) p = 0;
			// 1-8) 둘의 값이 같지 않으면
			else {
				// 1-8)-1. 1씩 누적시키기
				p++;
				// 1-8)-2. 두 개의 값 중에 작은 걸 리턴
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
}