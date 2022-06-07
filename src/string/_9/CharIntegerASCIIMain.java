package string._9;

import java.util.Scanner;

/**
 * 9-1th, 숫자만 출력(CharInteger & ASCII)
 *
 * 1. 설명
 *  문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출해 그 순서대로 자연수를 만듦
 *  만약 "tge0a1h205er"에서 숫자만 추출하면 0, 1, 2, 0, 5이고
 *  이것을 자연수로 만들면 1205가 된다.
 *
 * 2. 출력
 *  첫 줄에 자연수를 출력함.
 *
 * 3. 예시 입력 : g0en2T0s8eSoft 예시 출력 : 208
 */

/**
 *  1. 해결방법
 *      1-1) 리턴할 int type 0으로 초기화
 *      1-2) for문으로 문자열의 문자를 하나씩 읽기
 *          -> str.toCharArray()를 사용해야 가능하다.
 *      1-3) 조건문 Integer type인 char의 문자형 숫자로 처리하기
 *          -> char(정수형==Integer) 48(0)부터 57(9)까지
 *          -> 문자형 숫자 0은 48이고 57은 9다.
 *      1-4) Integer(정수형) 연산처리
 *          -> Integer.parseInt("023")을 넣으면
 *          -> 내부 구현에서는 0, 2, 3 이렇게 문자열을 char 단위로 순회하면서
 *          -> * 10을 하며 자릿수를 올려준다.
 *          -> 값들을 모두 합쳐 숫자 23을 만들게 됨.
 *      1-5) 예시
 *          answer = 0,
 *          1) '0' -> answer = (answer*10) + 0 #answer = 0
 *          2) '2' -> answer = (answer*10) + 2 #answer = 2
 *          3) '3' -> answer = (answer*10) + 3 #answer = 23
 */
public class CharIntegerASCIIMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		CharIntegerASCIIMain main = new CharIntegerASCIIMain();
		System.out.println(main.solution(str));
	}

	private int solution(String str) {
		// 1-1) 리턴할 int type 0으로 초기화
		int answer = 0;

		// 1-2) for문으로 문자열의 문자를 하나씩 읽기
		for (char x : str.toCharArray()) {
			// 1-3) 조건문 Integer type인 char의 문자형 숫자로 처리하기
			if (x >= 48 && x <= 57) {
				// 1-4) Integer(정수형) 연산처리
				answer = answer*10+(x-48);
			}
		}
		return answer;
	}
}
