package _1.string._11;


import java.util.Scanner;

/**
 * 11th, 문자열 압축(StringValueOf & IntegerToString)
 *
 * 1. 입력설명
 *  첫 줄에 문자열이 주어짐. 문자열의 길이는 100을 넘지 않음.
 *
 * 2. 출력설명
 *  춧 줄에 압축된 문자열을 출력한다.
 *
 * 3. 입력예제 : KKHSSSE 출력예제 : K2HS3E
 *
 * 4.
 *        i     0|1|2|3|4|5|6|
 * String str   k|k|h|s|s|s|e|
 * cnt = 1
 *
 * 비교는 i와 i+1 지점이 같은지?
 *   같으면 1 증가하기
 *   같지 않으면 리턴 변수에 K2를 담고, 다시 cnt를 1로 초기화
 */

/**
 *  1. 해결방법
 *      1-1) 리턴 type 초기화 시키기
 *      1-2) cnt = 1로 초기화 시키기
 *      1-3) 빈 문자 추가하기
 *          -> 마지막 index 값을 뽑아내기 위해 빈 문자를 추가한다.
 *      1-4) for문
 *          -> str.length()-1인 이유는? -1해야 마지막 Index 값이 나옴
 *      1-5) 조건문 해당 문자가 다음 문자와 같을 때
 *          1-5)-1. 카운트 숫자 누적시키기
 *      1-6) 같지 않으면
 *          1-6)-1. 해당 문자를 리턴 변수에 누적시키기
 *      1-7) 카운트가 1보다 크면
 *          1-7)-1. 카운트 숫자도 리턴 변수에 누적시키기
 *          1-7)-2. 누적시킨후 다시 1로 초기화
 */
public class StringValueOfOrIntegerToStringMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		StringValueOfOrIntegerToStringMain main = new StringValueOfOrIntegerToStringMain();
		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		// 1-1) 리턴 type 초기화 시키기
		String answer = "";
		// 1-2) cnt = 1로 초기화 시키기
		int cnt = 1;
		// 1-3) 빈 문자 추가하기
		str = str + " ";

		// 1-4) for문
		for (int i = 0; i < str.length()-1; i++) {
			// 1-5) 조건문 해당 문자가 다음 문자와 같을 때
			if (str.charAt(i) == str.charAt(i+1)) {
				// 1-5)-1. 카운트 숫자 누적시키기
				cnt++;
			// 1-6) 같지 않으면
			} else {
				// 1-6)-1. 해당 문자를 리턴 변수에 누적시키기
				answer += str.charAt(i);
				// 1-7) 카운트가 1보다 크면
				if (cnt > 1) {
					// 1-7)-1. 카운트 숫자도 리턴 변수에 누적시키기
					// answer+=String.valueOf(cnt);
					answer+=Integer.toString(cnt);
					// 1-7)-2. 누적시킨후 다시 1로 초기화
					cnt = 1;
				}
			}
		}
		return answer;
	}
}