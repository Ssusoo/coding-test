package string._1;

import java.util.Scanner;

/**
    1. 문자찾기
        예시
            입력 String Computercooller       char c

            출력 2
    2. 해결방법
        1) 입력 Scanner 객체 만들기
        2) 입력 받을 해당 객체 만들기
        3) String Type 단어(문자열) 입력 받기
        4) Char Type 체크하고 싶은 문자 받기
        5) 로직 처리할 객체의 메소드 만들기
        6) 해당 메소드 안에 로직 처리하기
            6-1) 리턴 답변 초기화
            6-2) 해당 문자열 UpperCase(대문자) 처리하기
                -> 문자열을 통일 해야 해당 문자열을 for을 돌며 검증할 수 있다.
            6-3) 해당 문자 UpperCase(대문자) 처리하기
                -> 문자를 통일 해야 해당 문자를 통해 for을 돌려 '문자열'을 검증할 수 있다.
            6-4) forEach 사용해서 문자열에 들어있는 '문자'를 돌며 검증시키기
                6-4)-1. 조건문으로 x == 문자가 같으면 답변 카운트 한 개씩 올리기
            6-5) forEach을 돌린 후 마지막에 답변 카운트를 return하기
*/
public class Review {

    public static void main(String[] args) {
        Review T = new Review();

        Scanner scanner = new Scanner(System.in);

        System.out.println("단어를 입력하세요.");
        String str = scanner.next();

        System.out.println("갯수를 체크하고 싶은 단어를 입력하세요.");
        char c = scanner.next().charAt(0);

        System.out.println(T.solution(str,c));
    }

    private int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();

        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()) {
            if (x == c) answer ++;

        }

        return answer;
    }
}
