package string._8;

import java.util.Scanner;

/**
 * 8th, 펠린드롬(replaceAll & StringBuilder)
 * 1. 설명
 *  앞에서 읽을 때나 뒤에서 읽을 떄나 같은 문자열을 펠린드롬이라고 함.
 *  문자열이 입력되면 해당 문자열이 펠린드롬이면 YES 아니면 NO를 출력
 *  단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며 대소문자를 구분하지 않음.
 *  알파벳 이외의 문자들은 무시함.
 *
 * 2. 출력
 *  첫 번째 줄에 펠린드롬인지의결과를 YES 또는 NO를 출력함.
 *
 * 3. 예시 입력 : found7, time; study; yduts; emit, 7Dnuof 예시 출력 YES
 */

/**
 *  1. 해결방법
 *      1-1) 알파멧을 뺀 나머지를 없애기 위해 replaceAll 쓰기
 * 		     replace에는 정규식을 못쓰나 replaceAll()에는 정규식표현을 쓸 수 있다.
 * 		     '^' 부정이기에 A-Z까지 알파벳이 아닌 나머지는 "" 빈 문자시키기
 * 		1-2) 잘 나오는지 출력하기
 * 	    1-3) StringBuilder를 써서 reserve 뒤집기하기
 * 	    1-4) 조건문 Equals를 통해 두 문자를 비교 후 YES 처리하기
 */

public class ReplaceAllStringBuilderMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();

		ReplaceAllStringBuilderMain main = new ReplaceAllStringBuilderMain();
		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		String answer = "NO";

		// 1-1) 알파멧을 뺀 나머지를 없애기 위해 replaceAll 쓰기
		str = str.toUpperCase().replaceAll("[^A-Z]", "");

		// 1-2) 잘 나오는지 출력하기
		System.out.println(str);

		// 1-3) StringBuilder를 써서 reserve 뒤집기하기
		String tmp = new StringBuilder(str).reverse().toString();

		// 1-4) 조건문 Equals를 통해 두 문자를 비교 후 YES 처리하기
		if (str.equals(tmp)) answer = "YES";


		return answer;
	}
}