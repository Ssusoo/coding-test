package string._4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4-1th, 단어 뒤집기(StringBuilder.reverse.toString)
 *  1. 설명
 *      N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램
 *  2. 입력
 *      첫 줄에 자연수 N이 주어짐
 *      두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어짐.
 *      단어는 영어 알파벳으로만 구성 됨.
 *  3. 출력
 *      N 개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력.
 *  4. 예시 입력 : 3 입력 후 good, Time, Big 예시 출력 : doog, emiT, giB
 */

/**
 *  1. 해결 방법
 *      1) 입력받을 단어 갯수인 자연수 N개 입력받기
 *      2) 입력받을 단어를 담기 위해 String 배열로 생성
 *      3) for문으로 String 배열의 갯수만큼 입력받기
 *      4) 객체 생성하기
 *      5) 출력 로직 메소드 만들기
 *      6) 출력 로직 메소드
 *          6-1) 뒤집어진 단어를 String을 원소로 갖는 배열로 리턴해주기
 *          6-2) 단어 뒤집기(단어 탐색)
 *              6-2)-1. StringBuilder Type으로 문자열 객체 만들기
 *              6-2)-2. StringBuilder에 담긴 문자를 reverse를 통해 뒤집고
 *              6-2)-3. toString으로 String화 시켜 String 변수에 담기
 *              * StringBuilder는 한 번만 만든 객체로 무한적으로 사용 가능. String은 계속해서 객체를 만들어야하기 때문에
 *              * String을 사용하는 게 아니라 StringBuilder를 통해 객체를 한 번만 만들어서 사용한다.
 *          6-3) 뒤집어진 String 문자를 리턴 ArrayList에 담기(add)
 */
public class StringBuilderReverseToStringMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		// 1) 입력받을 단어 갯수인 자연수 N개 입력받기
		int n = kb.nextInt();

		// 2) 입력받을 단어를 담기 위해 String 배열로 생성
		String[] str = new String[n];

		// 3) for문으로 String 배열의 갯수만큼 입력받기
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}

		// 4) 객체 생성하기
		StringBuilderReverseToStringMain main = new StringBuilderReverseToStringMain();

		// 5) 출력 로직 만들기
		for (String x : main.solution(str)) {
			System.out.println(x);
		}
	}

	// 6) 출력 로직 메소드
	private ArrayList<String> solution(String[] str) {
		// 6-1) 뒤집어진 단어를 String을 원소로 갖는 배열로 리턴해주기
		ArrayList<String> answer = new ArrayList<>();

		// 6-2) 단어 뒤집기(단어 탐색)
		for (String x : str) {
			// 6-2)-1. StringBuilder Type으로 문자열 객체 만들기
			// 6-2)-2. StringBuilder에 담긴 문자를 reverse를 통해 뒤집고
			// 6-2)-3. toString으로 String화 시켜 String 변수에 담기
			String tmp = new StringBuilder(x).reverse().toString(); // StringBuilder(good).
			// 6-3) 뒤집어진 String 문자를 리턴 ArrayList에 담기(add)
			answer.add(tmp);

		}
		return answer;
	}
}

