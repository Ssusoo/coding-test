package string._1;

import java.util.Scanner;

/*
    1. 문자찾기
        한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
        알아내는 프로그램을 작성하기. 대소문자를 구분하지 않음. 문자열의 길이는 100을 넘지 않음.

        입력
            첫 줄에 문자열이 주어지고 두 번쨰 줄에 문자가 주어짐.
            문자열은 영어 알파벳으로만 구성됨.
        출력
            첫 줄에 해당 문자의 개수를 출력함.

        예시
            입력 String Computercooller       char c

            출력 2
*/
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(main.solution(str, c));
    }

    private int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // TODO for
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        // TODO forEach
        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }
        return answer;
    }
}