package hashmap._2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 2th, 아나그램(toCharArray())
 *
 * 1. 설명
 *  아나그램이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면
 *  두 단어는 아나그램이라고 함. 예를 들면 AbaAeCe와 baeeACA는 알파벳 순서는 다르지만
 *  그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 *  알파벳과 그 개수가 모두 일치함. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라고 함.
 *
 * 2. 출력
 *  두 단어가 아나그램이면 YES, 아니면 NO를 출력함.
 *
 * 3. 예시 입력 AbaAeCe baeeACA 예시 출력 YES
 */
public class ToCharArrayMain {
    public static void main(String[] args) {
        ToCharArrayMain T = new ToCharArrayMain();

        Scanner kb = new Scanner(System.in);

        // 첫 번째 줄
        String first = kb.next();

        // 두 번째 줄
        String second = kb.next();

        System.out.println(T.solution(first, second));
    }

    private String solution(String first, String second) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        // Hash first 조회하기
        for (char key : first.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) +1);
        }

        // Hash second 조회하기
        for (char key : second.toCharArray()) {
            // 키(map.containsKey())가 있는지 값이 있는지 확인하는 함수(map.containsValue())
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";
            map.put(key, map.get(key) -1);
        }
        return answer;
    }
}