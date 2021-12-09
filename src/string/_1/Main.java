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
    private int solution(String str, char c) {
        // TODO 문자 카운트
        int answer = 0;

        // TODO 대문자로 바꾸기
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // TODO for
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer++;
        }
        // TODO forEach
        for (char x : str.toCharArray()) {   // forEach (문자타입 변수 : [배열, 컬렉션프레임워크])
            if (x == c) answer++;
        }                                   // String만 넣을 수 없기 때문에
                                            // 문자열 toCharArray()로 고쳐주기
        return answer;
    }

    public static void main(String[] args) {
        // TODO 객체 생성
        Main T = new Main();

        // TODO 입력 메소드
        Scanner kb = new Scanner(System.in);

        // TODO 문자열 받기
        String str = kb.next();

        // TODO 문자 받기
        char c = kb.next().charAt(0);

        // TODO 솔루션 메소드 객체에 담아 프린트 찍기
        System.out.println(T.solution(str, c));
    }
}