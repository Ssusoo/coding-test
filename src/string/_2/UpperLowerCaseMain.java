package string._2;

import java.util.Scanner;

/**
 * 2th, 대소문자 변환
 *      대소문자와 소문자가 같이 존재하는 문자열을 입력받아
 *      대소문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램
 *
 *      입력
 *           첫 줄에 문자열이 입력됨. 문자열의 길이는 100을 넘기지 않음.
 *           문자열은 영어 알파벳으로만 구성됨.
 *      출력
 *           첫 줄에 대문자는 소문자로 소문자는 대문자로 변환된 문자열을 출력
 *
 *      예시 Study / sTUDY
 */
public class UpperLowerCaseMain {
    private String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            // TODO 소문자일 경우 대문자로
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            // TODO 대문자일 경우 소문자로
            else  answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        UpperLowerCaseMain T = new UpperLowerCaseMain();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
