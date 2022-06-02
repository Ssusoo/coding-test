package string._2;

import java.util.Scanner;

/**
 * 2th, 대소문자 변환
 *  대소문자와 소문자가 같이 존재하는 문자열을 입력받아
 *  대소문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램
 *
 *  입력
 *      첫 줄에 문자열이 입력됨. 문자열의 길이는 100을 넘기지 않음.
 *      문자열은 영어 알파벳으로만 구성됨.
 *  출력
 *      첫 줄에 대문자는 소문자로 소문자는 대문자로 변환된 문자열을 출력
 *
 *  예시 Study / sTUDY
 *
 *  *해결방법
 *      1) 문자와 문자열 받기
 *          1-1) 한 개의 문자열 받기
 *      2) 객체를 생성 후 구현 로직 메소드에서 받아야할 항목들
 *          2-1) return 받을 type(String or int) 설정하기
 *          2-2) 입력 받은 문자열 조회하기
 *          2-3) 문자열에서 대문자일 경우 소문자로 소문자일 경우 대문자로 변환하기
 *          2-4) Character을 이용해서 풀어내기
 */
public class Remind {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		// 객체 생성 후 로직 구현 메소드
		Remind remind = new Remind();
		System.out.println(remind.solution(str));


	}

	// 구현 로직
	private String solution(String str) {
		// return 받을 값 초기화
		String answer = "";

		// 문자열의 문자 조회하기
		for (char x : str.toCharArray()) {
			// 소문자일 경우 대문자로 대문자일 경우 소문자로 변환하기
			if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
}
