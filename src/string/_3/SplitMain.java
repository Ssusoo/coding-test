package string._3;

import java.util.Scanner;

/**
 * 3th, 문장 속 단어(Split)
 *  1. 설명
 *      한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램
 *      문장 속의 단어는 공백으로 구분된다.
 *  2. 입력
 *      첫 줄에 길이가 100을 넘지 않는 한 개의 문장
 *      문장은 영어 알파벳으로만 구성
 *  3. 출력
 *      첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러 개일 경우
 *      문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
 *  4. 예시 입력 : it is time to study, 예시 출력 : study
 *
 */

/**
 *  1. 예시 입력 : it is time to study, 예시 출력 : study
 *
 *  2. 해결방법
 *      1) 입력 Scanner 객체 만들기
 *      2) String Type 단어(문장)이기 때문에 nextLine()
 *      3) 입력 받을 해당 객체 만들기
 *      4) 로직 처리할 객체의 메소드 만들기
 *      5) 해당 메소드 안에 로직 처리하기
 *          5-1) 답변 값 초기화
 *          5-2) 가장 긴 단어를 찾기(최소값으로 초기화)
 *              5-2)-1. Integer.MIN_VALUE; -> 가장 작은 값으로 초기화 됨.
 *          5-3) 띄워쓰기로 구분해서 해당 값을 String 배열에 담기
 *              5-3)-1. String[] s = str.split(" ");
 *                  s[0] = it, s[1] = is ...
 *          5-4) 해당 값이 잘 들어갔는지 출력하기
 *          5-5) 해당 로직 구성
 *              5-5)-1. 해당 값에 길이 판단하기 배열은 length
 *                  -> 각각의 단어의 길이가 len에 들어감.
 *              5-5)-2. 조건문(해당 길이가 최소값보다 클 경우)
 *              5-5)-3. 가장 긴 단어 변수에 해당길이로 바꿔주기
 *              5-5)-4. 리턴 답변 변수에 forEarch로 검증한 String 변수 x로
 */
public class SplitMain {

	public static void main(String[] args) {
		// 1) 입력 Scanner 객체 만들기
		Scanner kb = new Scanner(System.in);

		// 2) String Type 단어(문장) 입력 받기
		String str = kb.nextLine();

		// 3) 입력 받을 해당 객체 만들기
		SplitMain main = new SplitMain();

		// 4) 로직 처리할 객체의 메소드 만들기
		System.out.println(main.solution(str));
	}

	// 5) 해당 메소드 안에 로직 처리하기
	private String solution(String str) {
		// 5-1) 답변 값 초기화
		String answer = "";

		// 5-2) 가장 긴 단어를 찾기(최소값으로 초기화)
		int m = Integer.MIN_VALUE;

		// 5-3) 띄워쓰기로 구분해서 해당 값을 String 배열에 담기
		String[] s = str.split(" ");

		// 5-4) 해당값이 잘 들어갔는지 출력
		for (String x : s) {
			System.out.println(x);
		}

		// 5-5) 해당 로직 작성
		for (String x : s) {
			// 5-5)-1. 각각의 단어의 길이가 len에 들어감.
			int len = x.length();
			// 5-5)-2. 조건문(해당 길이가 최소값보다 클 경우)
			if (len > m) {
				// 5-5)-3. 가장 긴 단어 변수에 해당길이로 바꿔주기
				m = len;
				// 5-5)-4. 리턴 답변 변수 교체하기(forEarch로 검증한 String 변수 x로)
				answer = x;
			}
		}

		return answer;
	}
}