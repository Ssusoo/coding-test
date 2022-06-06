package string._7;


import java.util.Scanner;

/**
 * 7-1th, 회문 문자열(UpperCaseLength)
 * 1. 설명
 *  앞에서 읽을 때나 뒤에서 읽을 떄나 같은 문자열을 회문 문자열이라고함.
 *  문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
 *  회문 문자열이 아니면 "NO"를 출력하는 프로그램
 *
 * 2. 출력
 *  첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력함.
 *
 * 3. 예시입력 : gooG, 예시 출력 YES
 */

/**
 *  1. 해결방법(로직 구현 메소드부터)
 *      1-1) 리턴 타입과 참이면 YES로 처리하기
 *      1-2) 입력 문자를 대문자로 변화시키기
 *          -> gooG로 그냥 비교하면 참이 아니기 때문에 문자열의 문자를 다 대문자로 치환.
 *      1-3) 해당 문자열의 길이를 int 변수에 담기
 *          -> 문자열의 길이 나누기 2를 하기 위해서
 *          -> 문자열의 길이 짝수 일때 gooG(4) index 0과1로 나머지 index를 비교 하기 위해
 *          -> 문자열의 길이 홀수 일때 statu(5) s(0), t(1), a(3), t(4), u(5)
 *      1-4) for문에 int 변수에 담은 len으로 나누기 2 해주기
 *      1-5) 조건문(회문 문자열의 조건 문자와 문자가 같지 않으면 NO 맞으면 YES 리턴)
 *          -> 문자열의 문자를 가져오기 위해서는 charAt() 가져오면 된다.
 *          -> str.charAt(len-i-1)를 한 이유는?
 *              => gooG일 경우 4-0-1 = 3이기 때문에
 *              => index 3 = G를 가리킨다.
 *              => 첫 번째 index와 마지막 index의 값을 비교하기 위해서 하는 거임.
 */

public class UpperCaseLengthMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		UpperCaseLengthMain main = new UpperCaseLengthMain();
		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		// 1-1) 리턴 타입과 참이면 YES로 처리하기
		String answer = "YES";

		// 1-2) 입력 문자를 대문자로 변화시키기
		str = str.toUpperCase();

		// 1-3) 해당 문자열의 길이를 int 변수에 담기
		int len = str.length();

		// 1-4) for문에 int 변수에 담은 len으로 나누기 2 해주기
		for (int i = 0; i < len/2; i++) {
			// 1-5) 조건문(회문 문자열의 조건 문자와 문자가 같지 않으면 NO 맞으면 YES 리턴)
			if (str.charAt(i) != str.charAt(len-i-1)) {
				return "NO";
			}
		}
		return answer;
	}
}