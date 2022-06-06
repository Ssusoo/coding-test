package string._7;

import java.util.Scanner;

/**
 * 7-2th, 회문 문자열( StringBuilderEqualsIgnoreCase)
 * 1. 예시입력 : gooG, 예시 출력 YES
 */

/**
 *  1. 해결방법
 *      1-1) 리턴 타입과 참이 아니면 NO로 처리하기
 *      1-2) StringBuilder로 문자열 뒤집기
 *      1-3) equalsIgnoreCase()로 대소문자 구별없이 비교하기
 */
public class StringBuilderEqualsIgnoreCaseMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		StringBuilderEqualsIgnoreCaseMain main = new StringBuilderEqualsIgnoreCaseMain();
		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		// 1-1) 리턴 타입과 참이 아니면 NO로 처리하기
		String answer = "NO";

		// 1-2) StringBuilder로 문자열 뒤집기
		String tmp = new StringBuilder(str).reverse().toString();

		// 1-3) equalsIgnoreCase()로 대소문자 구별없이 비교하기
		if (str.equalsIgnoreCase(tmp)) answer = "YES";

		return answer;
	}
}