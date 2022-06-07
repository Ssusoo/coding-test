package string._9;


import java.util.Scanner;

/**
 * 9-2th, 숫자만 출력(isDigit & Integer.parseInt)
 * 1. 예시 입력 : g0en2T0s8eSoft 예시 출력 : 208
 */

/**
 *  1. 해결방법
 *      1-1) String type
 *      1-2) for문으로 문자열의 문자를 하나씩 읽기
 *      1-3) 문자의 문자를 검증하기
 *          -> isDigit() : 숫자냐고 물어보는 메소드
 *      1-4) 0208 -> 208로 출력하기
 *          -> 기본 리턴 값은 '0208'으로 출력됨.
 *          -> 여기서 parseInt를 하면 208로 출려된다.
 */
public class IsDigitParseIntMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		IsDigitParseIntMain main = new IsDigitParseIntMain();
		System.out.println(main.solution(str));
	}

	private int solution(String str) {
		// 1-1) String type
		String answer = "";

		// 1-2) for문으로 문자열의 문자를 하나씩 읽기
		for (char x : str.toCharArray()) {
			// 1-3) 문자의 문자를 검증하기
			if (Character.isDigit(x)) answer+=x; // 0208
		}

		// 1-4) 0208 -> 208로 출력하기
		return Integer.parseInt(answer);
	}
}