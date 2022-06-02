package hashmap._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3th, 매출액의 종류
 *  현수의 아빠는 현수에게 N일 동안의 매출기록을 주고
 *  연속된 K일 동안의 매출액의 종류를 구간별로 구하라고 했음.
 *
 *  만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 N=4이면
 *  20, 12 20, 10, 23, 17, 10 각 연속 4일간의 구간 매출 종류는
 *  첫 번째 구간은 [20, 12, 20, 10] 매출액의 종류 20, 12, 10으로 3이다.
 *
 *  N일 간의 매출 기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터
 *  각 구간별 매출액의 종류를 출력하는 프로그램
 *
 *  입력설명
 *      첫 줄에 N과 K가 각각 주어짐.
 *      두 번쨰 줄에 N개의 숫자열이 주어짐.
 *
 *  입력예제
 *      첫 번째 줄 7과 4
 *      두 번째 줄 20(7, 시작) 12 20 10(4, 시작) 23 17 10
 *  출력 예제
 *      20 12 20 10 23 17 10
 *      3 4 4 3
 *
 *  해결
 *      1) 0-6까지의 배열
 *      2) 중간에서 시작할 숫자
 *      3)
 */
public class Remind {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		Remind remind = new Remind();
		for (int x : remind.sloultion(n, k, arr)) System.out.println(x + " ");
	}

	private ArrayList<Integer> sloultion(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}

		int lt = 0;

		for (int rt = k-1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt],0) +1);

			answer.add(map.size());

			map.put(arr[lt], map.get(arr[lt]) -1);

			if (map.get(arr[lt]) == 0) map.remove(arr[lt]);

			lt++;
		}
		return answer;
	}
}