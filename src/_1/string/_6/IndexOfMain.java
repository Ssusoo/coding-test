package _1.string._6;

import java.util.Scanner;

/**
 * 6th, 중복문자제거(indexOf())
 *  1. 설명
 *      소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램
 *  2. 입력
 *      첫 줄에 문자열이 입력됨. 문자열의 길이는 100을 넘지 않음.
 *  3. 출력
 *      첫 줄에 중복문자가 제거된 문자열을 출력함.
 *  4. 예시 입력 : ksekkset 예시 출력 : kset
 */

/**
 * 1. 해결방법(로직 메소드)
 *      1) 반환 type 지정하기
 *      2) for문을 사용해서 맨 처음 발견된 문자 출력해보기
 *          2-1) 조건문을 사용해서 해당의 첫 문자와 입력된 문자가 같을 조건 만들기
 *          2-2) 조건에 부합하면 답변 리턴에 누적시키기
 */
public class IndexOfMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		IndexOfMain main = new IndexOfMain();
		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		// 1) 반환 type 지정하기
		String answer = "";

		// 2) for문을 사용해서 맨 처음 발견된 문자 출력해보기
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+ " " + i + " " +str.indexOf(str.charAt(i)));
			// 2-1) 조건문을 사용해서 해당의 첫 문자와 입력된 문자가 같을 조건 만들기
			if (str.indexOf(str.charAt(i)) == i) {
				// 2-2) 조건에 부합하면 답변 리턴에 누적시키기
				answer += str.charAt(i);
			}
		}
		return answer;
	}
}