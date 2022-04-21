package hashmap._2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 예시 입력-1(출력 YES)
 * AbaAeCe
 * baeeACA
 */

/**
 * 해결 방법
 *  1) 객체 생성
 *  2) 문자열을 두 번 입력받는다.
 *  3) 아나그램을 해결할 메소드를 생성한다.
 *  4) 문자열을 구별할 해쉬맵 생성
 *  5) 문자열1을 해쉬맵에 문자 타입으로 저장 .put()
 *  6) 문자열2를 해쉬맵에 문자 타입으로 저장하는데,
 *      여기서는 문자열1에 저장된 값과 비교하며 최종적으로 key 값의 value를 0으로 해야
 *      아나그램과 일치하므로 -1을 해야 한다.
 *      조건문으로 key 값이 없거나 value값이 0일 때 아나그램이 성립(같이 다르기 때문에)이 안 되기 때문에
 *      그때는 NO를 리턴해야 된다.
 */
public class Remind {
    public static void main(String[] args) {
        Remind remind = new Remind();

        Scanner kb = new Scanner(System.in);

        String first = kb.next();
        String second = kb.next();

        System.out.println(remind.solution(first, second));
    }

    private String solution(String first, String second) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : first.toCharArray()) {  // AbaAeCe
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : second.toCharArray()) { // baeeACA
            // key와 value값 검증
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";    // baeeACA이 아닌 경우
            map.put(key, map.getOrDefault(key, 0) - 1);
        }
        return answer;
    }
}