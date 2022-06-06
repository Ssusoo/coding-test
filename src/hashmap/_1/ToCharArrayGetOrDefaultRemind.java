package hashmap._1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 예시 입력                                       예시 출력
 *  반 학생수 : 15
 *  선생님 발표한 순서 : BACBACCACCBDEDE(15)             c
 */
public class ToCharArrayGetOrDefaultRemind {

    public static void main(String[] args) {
        ToCharArrayGetOrDefaultRemind T = new ToCharArrayGetOrDefaultRemind();

        Scanner kb = new Scanner(System.in);

        // TODO 투표
        String str = kb.next();

        System.out.println(T.solution(str));
    }

    private char solution(String str) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

}
