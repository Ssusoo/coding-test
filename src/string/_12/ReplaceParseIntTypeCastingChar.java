package string._12;

import java.util.Scanner;

/**
 * 12th, 암호(ReplaceParseIntTypeCastingChar)
 *
 * 1. 설명
 *  현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 *  비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어있다.
 *  비밀편지는 알파벳 한 문자마다 '#' 또는 '*'이 일곱개로 구성됨.
 *  만약 현수가 "#*****#"으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석함.
 *
 * 2. 약속한 규칙
 *  1) "#*****#"를 일곱자리의 이진수로 바꾼다. #은 이진수의 1로, *은 이진수의 0으로 변환함.
 *      결과는 "1000001"로 변환 됨.
 *  2) 바뀐 2진수를 10진수화한다. "1000001"을 10진수화 하면 65가 됨.
 *  3) 아스키 번호가 65 문자로 변환된다. 즉, 대문자 A다.
 *
 * 3. 문제
 *  현수가 4개의 문자를 다음과 같이 신호로 보냈다면
 *  #****###**#####**#####**##**
 *
 *  예시 출력 COOL
 *
 * 4. 생각정리
 *  1) 쭉 나열된 문자를 7개씩 잘라서 4개의 문자열로 어떻게 바꿀까?
 *      -> 7개 씩 자르기 위해서는 substring을 사용하기
 *      -> .substring(0, 7)할 경우 0부터 7까지의 문자를 자른다.
 *      -> 하지만 지금 이 상태로는 4번의 똑같은 문자로 출력된다.
 *      -> 다음 7개의 문자를 자르지 않았기 때문에 그렇다.
 *  2) 반복된 문자를 자르는 게 아니라 다른 문자로 넘어가서 자르기 위해서는
 *      -> .substring(7)잘라주는 것으로 해서 for문에서 다음 7개의 문자로 넘어감.
 *  3) 7개씩 4개로 자른 문자를 어떻게 #일 때는 1로 *일 때는 0으로 치환해줄까?
 *      -> replcace() 메소드를 통해 해결할 수 있다.
 *      -> .replcae('#', '1').replace('*', '0')으로 해서 치환시켜줄 수 있다.
 *  4) 치환한 문자열 타입의 숫자를 10진수 바꿔 2진수로 어떻게 바꿔줄까?
 *      -> Integer.parseInt()를 통해 문자열 타입의 숫자를 숫자 타입으로 변환시키기
 *      -> .parseInt(tmp, 2) 10진수의 숫자를 써서 2진수로 바꿔주기.
 *  5) 2진수로 바꾼 값을 어떻게 아스키문자로 바꿔줄까?
 *      -> 리턴할 변수에 (char) 문자로 캐스트해서 문자로 바꿔주면 된다.
 */

/**
 * 1. 해결 방법
 *  1-1) 리턴 type 정해주기
 *  1-2) for문으로 입력한 문자열의 값을 조회하기
 *      1-2)-1. 7개씩 잘라 4개의 문자열의 값으로 바꿔주기
 *          -> .substring(0, 7) 사용하기
 *      1-2)-2. 문자열의 값 출력하기
 *          -> 반복된 문자가 출력되기 때문에
 *      1-2)-3. 다음 문자열의 값을 7개씩 자르기
 *          -> .substring(7)
 *      1-2)-4. 7개씩 자른 문자열의 값을 '#' -> 1로 '*' -> 0으로 치환
 *          -> replace()
 *      1-2)-5. 10진수를 2진수로 변환하기
 *          -> parseInt(tmp, 2)
 *      1-2)-6. 리턴 변수에 담아주기(단, 문자로)
 *          -> 아스키 넘버를 (char)문자로 타입으로
 */
public class ReplaceParseIntTypeCastingChar {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();

		ReplaceParseIntTypeCastingChar main = new ReplaceParseIntTypeCastingChar();
		System.out.println(main.solution(n, str));

	}

	private String solution(int n, String str) {
		// 1-1) 리턴 type 정해주기
		String answer = "";

		// 1-2) for문으로 입력한 문자열의 값을 조회하기
		for (int i = 0; i < str.length(); i++) {

			// 1-2)-1. 7개씩 잘라 4개의 문자열의 값으로 바꿔주기
			String tmp = str.substring(0, 7)
					// 1-2)-4. 7개씩 자른 문자열의 값을 '#' -> 1로 '*' -> 0으로 치환
					.replace("#", "1")
					.replace("*", "0");

			// 1-2)-3. 다음 문자열의 값을 7개씩 자르기
			str = str.substring(7);

			// 1-2)-5. 10진수를 2진수로 변환하기
			int num = Integer.parseInt(tmp, 2 );

			// 1-2)-2. 문자열의 값 출력하기
			System.out.println(tmp + " " + num);

			// 1-2)-6. 리턴 변수에 담아주기(단, 문자로)
			answer += (char)num;
		}
		return answer;
	}
}