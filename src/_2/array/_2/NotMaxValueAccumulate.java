package _2.array._2;

import java.util.Scanner;

/**
 * 2th, 보이는 학생(NotMaxValueAccumulate)
 *
 * 1. 설명
 *  선생님이 N명의 학생을 일렬로 세웠다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때
 *  맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램
 *  *어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않는다.
 *
 * 2. 입력
 *  첫 줄에 정수가 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * 3. 출력설명
 *  선생님이 볼 수 있는 최대학생수를 출력한다.
 *
 * 4. 입력예제 8, 130 135 148 140 145 150 150 153 출력예제 5
 *
 * 5. 생각정리
 *  1-1) 리턴 변수의 초기값을 0으로 해야할까? 1로 해야할까?
 *      -> index[0]이 최대 값의 크기 비교를 위한 판별의 기준 값이 된다.
 *      -> 리턴 변수의 초기값은 0이 아니라 1이 될 수밖에 없다.
 *  1-2) for문을 통해 데이터 값 조회하기
 *      -> for문의 시작은 int = 0;이 아닌 int = 1이 되어야 한다.
 *      -> 이유는 초기 값이 이미 세팅 되어있기에
 *  1-3) 조건문 index[1] > 최대값보다 큰면?
 *      1-3)-1. 누적 카운트를 한다.
 *      1-3)-2. 기존 최대값을 새로운 최대값으로 교체해준다.
 */
public class NotMaxValueAccumulate {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}

		NotMaxValueAccumulate main = new NotMaxValueAccumulate();
		System.out.println(main.solution(n, arr));
	}

	private int solution(int n, int[] arr) {
		// 1-1) 리턴 변수의 최대값을 1로 하기
		int answer = 1;

		// 1-2) 기준이 될 수 있는 최대값 정하기
		int max = arr[0];

		// 1-3) for문으로 데이터 조회
		for (int i = 1; i < n; i++) {
			// 1-4) 기존 최대값보다 크면
			if (arr[i] > max) {
				// 1-4)-1. 누적 시키기
				answer++;

				// 1-4)-2. 최대값 교체해주기
				max = arr[i];
			}
		}
		return answer;
	}
}