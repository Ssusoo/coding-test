package string._2;

import java.util.Scanner;

/**
 * 2th, 대소문자 변환
 *  예시 Study / sTUDY
 *
 *  2. 해결방법
 *      1) 입력 Scanner 객체 만들기
 *      2) String Type 단어(문자열) 입력 받기
 *      3) 입력 받을 해당 객체 만들기
 *      4) 로직 처리할 객체의 메소드 만들기
 *      5) 해당 메소드 안에 로직 처리하기
 *          5-1) 답변 카운트 초기화
 *          5-2) forEach 사용해서 문자열에 들어있는 '문자'를 돌며 검증시키기
 *          5-3) 조건문(if 소문자일 경우 대문자로 바꾸고 else 대문자일 경우 소문자로 바꾸기)
 *          5-4) forEach을 돌린 후 마지막에 답변 카운트를 return하기
 */
public class Remind {

	public static void main(String[] args) {
		// 1) 입력 Scanner 객체 만들기
		Scanner kb = new Scanner(System.in);

		// 2) String Type 단어(문자열) 입력 받기
		String str = kb.next();

		// 3) 입력 받을 해당 객체 만들기
		Remind remind = new Remind();

		// 4) 로직 처리할 객체의 메소드 만들기
		System.out.println(remind.solution(str));
	}

	// 5) 해당 메소드 안에 로직 처리하기
	private String solution(String str) {
		// 5-1) 답변 카운트 초기화
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
