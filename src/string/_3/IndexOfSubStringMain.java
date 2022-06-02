package string._3;

import java.util.Scanner;

/**
 * 3th, 문장 속 단어(Index & SubString)
 *  1. 예시 입력 : it is time to study, 예시 출력 : study
 *
 *  2. 해결방법(로직 구현 부분부터)
 *      1) 답변 문자 초기화
 *      2) 가장 긴 단어 최소값으로 초기화(가장 긴 단어찾기)
 *      3) while문(indexOf(' ') != -1
 *          -> 띄워쓰기를 발견하면 index 번호 리턴 발견하지 못하면 -1을 리턴
 *          3-1) subString(index, index-1).
 *              -> 띄워쓰기 전까지기 때문에
 *          3-2) 각각의 단어 길이 넣기
 *          3-3) 조건문(해당 길이가 최소값보다 클 경우)
 *              -> >일 경우 가장 앞쪽에 있는 단어가 됨.
 *              -> >=일 경우 가장 뒤쪽에 있는 단어가 됨.
 *          3-4) 가장 긴 단어 변수에 해당길이로 바꿔주기
 *          3-5) 리턴 답변 변수 교체하기
 *      4) 다른 단어로 교체해주기
 *          -> 띄워쓰기 +1 이기에 'is'가 됨.
 *      5) study의 마지막 단어 적용시키기
 *          -> 공백이 없으면 -1 리턴하고 끝이기 때문에 'to'까지 하고 최종적으로 'time'이 나옴
 *
 */
public class IndexOfSubStringMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();

		IndexOfSubStringMain main = new IndexOfSubStringMain();

		System.out.println(main.solution(str));
	}

	private String solution(String str) {
		// 1) 답변 문자 초기화
		String answer = "";

		// 2) 가장 긴 단어 최소값으로 초기화(가장 긴 단어찾기)
		int m = Integer.MIN_VALUE;
		int pos;

		// 3) while문 사용하기
		while ((pos = str.indexOf(' ')) != -1) {
			// 3-1) Substring == Split
			String tmp = str.substring(0, pos);
			// 3-2) 각각의 단어 길이 넣기
			int len = tmp.length();
			// 3-3) 조건문(해당 길이가 최소값보다 클 경우) : > 가장 앞쪽에 위치한 단어를 답임.
			//                                      >= 가장 뒤쪽에 위치한 단어를 답
			if (len > m) {
				// 3-4) 가장 긴 단어 변수에 해당길이로 바꿔주기
				m = len;
				// 3-5) 리턴 답변 변수 교체하기
				answer = tmp;
			}
			// 4) 다른 단어로 교체해주기
			str = str.substring(pos+1);
		}
		//  5) study의 마지막 단어 적용시키기(적용 안 시키면 time 출력 됨.)
		if (str.length() > m) answer = str;
		return answer;
	}
}