package _1.string._2;

import java.util.Scanner;

/**
 * 2th, 대소문자 변환(IsToUpperLowerCase)
 * 1. 설명
 *  대소문자와 소문자가 같이 존재하는 문자열을 입력받아
 *  대소문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램
 *
 * 2. 입력
 *  첫 줄에 문자열이 입력됨. 문자열의 길이는 100을 넘기지 않음.
 *  문자열은 영어 알파벳으로만 구성됨.
 *
 * 3. 출력
 *  첫 줄에 대문자는 소문자로 소문자는 대문자로 변환된 문자열을 출력
 *
 * 4. 예시 입력 Study 예시출력 : sTUDY
 */

/**
 *  1. 해결방법
 *      1-1) 리턴 타입은 String, 초기화하기
 *      1-2) for문으로 문자열 조회
 *      1-3) 조건문 입력한 문자열의 문자가 소문자일 경우(is)
 *          1-3)-1. 소문자이면 대문자로 리턴 타입에 누적하기(to)
 *          1-3)-2. 대문자이면 소문자로 리턴 타입에 누적하기(to)
 */

public class IsToUpperLowerCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        IsToUpperLowerCase main = new IsToUpperLowerCase();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        // 1-1) 리턴 타입은 String, 초기화하기
        String answer = "";

        // 1-2) for문으로 문자열 조회
        for (char x : str.toCharArray()) {
            // 1-3) 조건문 입력한 문자열의 문자가 소문자일 경우(is)
            if (Character.isLowerCase(x)) {
                // 1-3)-1. 소문자이면 대문자로 리턴 타입에 누적하기(to)
                answer += Character.toUpperCase(x);
            } else {
                // 1-3)-2. 대문자이면 소문자로 리턴 타입에 누적하기(to)
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }
}