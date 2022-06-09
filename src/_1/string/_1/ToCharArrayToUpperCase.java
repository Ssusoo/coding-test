package _1.string._1;

import java.util.Scanner;

/**
 * 1th, 문자 찾기(ToCharArray & ToUpperCase)
 * 1. 설명
 *  한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
 *  알아내는 프로그램을 작성하기. 대소문자를 구분하지 않음. 문자열의 길이는 100을 넘지 않음.
 *
 * 2. 입력
 *  첫 줄에 문자열이 주어지고 두 번째 줄에 문자가 주어짐.
 *
 * 3. 출력
 *  첫 줄 에 해당 문자의 개수를 출력함.
 *
 * 4. 예시 입력 : Computercooller c 예시 출력 2
 */

/**
 *  1. 해결 방법
 *      1-1) 리턴 타입 초기화
 *      1-2) forEach 조회
 *          1-2)-1. 데이터 출력
 *      1-3) forEach 조회
 *          1-3)-1. 데이터 출력
 *      1-4) 조건문 문자열의 문자와 입력 문자가 같으면
 *          1-4)-1. 리턴 누적 시키기
 *      1-5) for문
 */

public class ToCharArrayToUpperCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        ToCharArrayToUpperCase main = new ToCharArrayToUpperCase();
        System.out.println(main.solution(str, c));

    }

    private int solution(String str, char c) {
        // 1-1) 리턴 타입 초기화
        int answer = 0;

        // 1-2) 문자열과 문자를 대문자건 소문자로 통일 시키기
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 1-3) forEach 조회
        for (char x : str.toCharArray()) {
            // 1-3)-1. 데이터 출력
            System.out.print(x);
            // 1-4) 조건문 문자열의 문자와 입력 문자가 같으면
            if (x == c) {
                // 1-4)-1. 리턴 누적 시키기
                answer++;
            }
        }
        // 1-5) for문
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        return answer;
    }
}