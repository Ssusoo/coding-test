package string._1;

import java.util.Scanner;

/**
 * 1th, String 문자찾기
 *  한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
 *  알아내는 프로그램을 작성하기. 대소문자를 구분하지 않음. 문자열의 길이는 100을 넘지 않음.
 *
 *  입력
 *      첫 줄에 문자열이 주어지고 두 번째 줄에 문자가 주어짐.
 *      문자열은 영어 알파벳으로만 구성됨.
 *  출력
 *      첫 줄에 해당 문자의 개수를 출력함.
 *
 *  예시
 *      입력 String Computercooller       char c
 *  출력 2
 *
 *  *해결방법
 *      1) 입력값 받기
 *          1-1) 한 개의 문자열을 받기
 *          1-2) 문자를 입력받기(해당 문자열에서 알고 싶은 문자의 갯수 파악하기)
 *      2) 객체를 생성 후 구현 로직 메소드에서 받아야할 항목들
 *          2-1) return 받을 type(String or int) 설정하기
 *          2-2) 문자열과 문자를 대문자로 변환 시키기
 *          2-3) for문이나 forEach 중 하나를 사용해서 문자의 갯수 로직 만들어주기
 *
 */
public class Remind {

    public static void main(String[] args) {
        // 입력값 받기
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        // 객체를 생성 후 로직 메소드
        Remind remind = new Remind();
        System.out.println(remind.solution(str, c));

    }

    /**
     * 로직 메소드
     * @param str
     * @param c
     * @return
     */
    private int solution(String str, char c) {
        // Return 값 초기화
        int answer = 0;

        // 문자열과 문자를 대문자 또는 소문자로 변환하기
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // for문이나 forEach를 사용해서 카운트 해주기
        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }
}
