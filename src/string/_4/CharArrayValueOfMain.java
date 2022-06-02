package string._4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 4-2th 특정 단어로 뒤집기(CharArrayValueOf)
 *  1. 해결방법(로직 메소드 부분부
 *      1-1) 단어 뒤집기(단어 탐색)
 *          1-1)-1. Char 문자 배열화 시키기
 *          1-1)-2. 문자(lt : 단어의 시작)와 문자(rt : 단어의 끝)끼리 위치 바꿔주기
 *              -> 문자 총 길이에서 -1 하기 index가 0부터 시작하며
 *              -> 마지막 index는 5가 아니라 4이기에 문자의 총 길이에서 -1을 한다.
 *      1-2) 반복문으로 문자(lt)와 문자(rt)끼리 위치 바꿔주기
 *          1-2)-1. 문자(lt)와 문자(rt)끼리 위치 바꿔주기
 *          1-2)-2. 문자[rt : 끝]를 문자[lt]에 담아주며 위치를 바꾸고
 *          1-2)-3. Char 변수에 담아둔 문자[lt]를 다시 문자[rt]에 담아준다.
 *          1-2)-4. 문자[lt]와 문자[rt]를 다음 단계로 전진시키기 위해 ++ --를 해준다.
 *      1-3) ArrayList<String>로 리턴을 하기 때문에 Char(문자)를
 * 			-> String(문자열)화 해야하기 때문에 String 변수에 담아준다.
 * 			-> valueOf() : 문자 배열을 String화 시킴.
 * 	    1-4) 뒤집어진 String 문자를 리턴 ArrayList에 담기(add)
 */
public class CharArrayValueOfMain {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}

		CharArrayValueOfMain main = new CharArrayValueOfMain();

		for(String x : main.solution(str)) {
			System.out.println(x);
		}
	}

	private ArrayList<String> solution(String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		// 1-1) 단어 뒤집기(단어 탐색)
		for (String x : str) {
			// 1-1)-1. Char 문자 배열화 시키기
			char[] s = x.toCharArray();

			// 1-1)-2. 문자(lt : 단어의 시작)와 문자(rt : 단어의 끝)끼리 위치 바꿔주기
			int lt = 0, rt = x.length()-1;

			// 1-2) 반복문으로 문자(lt)와 문자(rt)끼리 위치 바꿔주기
			while (lt < rt) {
				// 1-2)-1. 문자와 문자를 바꿔주기 위해 문자[lt : 시작]를 Char 변수에 먼저 담는다.
				char tmp = s[lt];
				// 1-2)-2. 문자[rt : 끝]를 문자[lt]에 담아주며 위치를 바꾸고
				s[lt] = s[rt];
				// 1-2)-3. Char 변수에 담아둔 문자[lt]를 다시 문자[rt]에 담아준다.
				s[rt] = tmp;
				// 1-2)-4. 문자[lt]와 문자[rt]를 다음 단계로 전진시키기 위해 ++ --를 해준다.
				lt++;
				rt--;
			}
			// 1-3) ArrayList<String>로 리턴을 하기 때문에 Char(문자)를
			//  String(문자열)화 해야하기 때문에 String 변수에 담아준다.
			//  valueOf() : 문자 배열을 String화 시킴.
			String tmp = String.valueOf(s);
			// 1-4) 뒤집어진 String 문자를 리턴 ArrayList에 담기(add)
			answer.add(tmp);
		}
		return answer;
	}
}