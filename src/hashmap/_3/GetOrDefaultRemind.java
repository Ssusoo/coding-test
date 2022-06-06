package hashmap._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3th, 매출액의 종류(getOrDefault)
 *  출력 예제
 *      20 12 20 10 23 17 10
 *      3 4 4 3
 *
 *  해결
 *      1) 0-6까지의 배열
 *      2) 중간에서 시작할 숫자
 *      3)
 */
public class GetOrDefaultRemind {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		GetOrDefaultRemind remind = new GetOrDefaultRemind();
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