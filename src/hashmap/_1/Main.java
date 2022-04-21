package hashmap._1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 예시 입력                                       예시 출력
 *  반 학생수 : 15
 *  선생님 발표한 순서 : BACBACCACCBDEDE(15)             c
 *
 *  1) 투표 입력값을 받는다.
 *  2) HashMap으로 각각의 문자를 key 값으로 두고 key값에 해당하는 Value를
 *      Integer로 받는다.
 *  3) For문으로 문자열의 문자를 key와 value로 구분 처리한다.
 *      String의 값은 toCharArray() 메서드를 써서
 *      문자열을 문자로 뽑아낸다.
 *  4) 카운트를 정의하고
 *  5) value 값에 대해 조건을 걸어 누적회사 높은 최대값을 처리
 *  6) 카운트 값을 리턴한다.
 */
public class Main {

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        // TODO 투표
        String str = kb.next();

        System.out.println(T.solution(str));
    }

    private char solution(String str) {
        // 초기화
        char answer = ' ';

        // 생성
        HashMap<Character, Integer> map = new HashMap<>();

        // 저장
        for (char key : str.toCharArray()) {    // BACBACCACCBDEDE
            map.put(key, map.getOrDefault(key, 0) + 1);
            /* map.put(key, value)로 담기는 값
                key : A, value : 3
                key : B, value : 3
                key : C, value : 5
                key : D, value : 2
                key : E, value : 2
            */
        }

        // 카운트
        int max = Integer.MIN_VALUE; // -21XXXX

        // TODO 저장된 모든 키가 저장된 Set을 반환함.
        for (char key : map.keySet()) { // key 5개(ABCDE)
            /* map.get(A-E)
                1) A : 3 > -2xxxx
                2) B : 3 > A : 3
                3) C : 5 > A : 3
                4) D : 2 > C : 5
                5) E : 2 > C : 5
            */

            // TODO value 값을 가져옴. value값의 타입을 Integer로 정했음.
            if (map.get(key) > max) {
                // key의 value값을 계속 max에 담음.
                max = map.get(key); // Value가 5인 C의 Key
                // value의 key 값을 리턴함.
                answer = key;   // C
            }
        }
        return answer;  // C : 5 값을 리턴
    }
}
