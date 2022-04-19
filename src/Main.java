import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 *
 * 설명
 *  학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록했습니다.
 *  투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여저 있고
 *  선생님은 그 기회를 발표하고 있습니다.
 *
 *  선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램
 *  반드시, 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정한다.
 *
 * 입력
 *  첫 번째 줄에는 반 학생수 N(5 <= N <= 50)이 주어짐.
 *  두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가
 *  선생님이 발표한 순서대로 문자열로 입력됨.
 *
 * 출력
 *  학급 회장으로 선택된 기호를 출력합니다.
 *
 * 예시 입력                                       예시 출력
 *  반 학생수 : 15
 *  선생님 발표한 순서 : BACBACCACCBDEDE                c
 */
public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);

        // 반 학생수
        int n = kb.nextInt();

        // 투표 용지
        String str = kb.next();

        System.out.println(T.solution(str));
    }

    private char solution(String str) {
        // 초기화
        char answer = ' ';

        // HashMap 생성(Key, Value)
        HashMap<Character, Integer> map = new HashMap<>();

        // HashMap 조회하기
        for (char key : str.toCharArray()) {
           map.put(key, map.getOrDefault(key, 0) +1);
        }

        // 투표 카운트 초기화
        int max = Integer.MIN_VALUE;

        // HashMap 출력하기
        for (char key : map.keySet()) {
            // Key값과 Value값 출력하기
            System.out.println(key + " " + map.get(key));

            // 투표 카운트 출력
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

}
