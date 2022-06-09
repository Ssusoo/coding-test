package _2.array._1;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1th, 큰 수 출력하기(ArrayListForEachPoint)
 *
 * 1. 설명
 *  첫 번째 입력값을 자연수 N개가 주어지고
 *  다음 줄에 N개의 정수가 입력된다.
 *
 * 2. 출력 설명
 *  자신의 바로 앞 수보다 큰 수만 한줄로 출력 된다.
 *
 * 3. 입력 예제 : 6, 7 3 9 5 6 12 출력 예제 7 9 6 12
 *
 * 4. 생각정리
 *      1-1) 입력 받은 6개의 숫자를 배열에 담는다.
 *      1-2) 출력되는 리턴 타입은 ArrayList<Integer>의 자료구조다.
 *      1-3) index[0]는 기본적으로 출력해주어야 한다.
 *          -> List에 add(index[0])을 통해 데이터를 넣어준다.
 *      1-4) 자신의 바로 앞 수보다 큰 수만 List에 어떤 방식으로 넣어줄까?
 *          1-4)-1. for문으로 배열에 담겨있는 데이터를 조회 후
 *              -> index[0]은 이미 리스트에 담았기 때문에 for문의 시작은 1부터하면 된다.
 *          1-4)-2. 배열에 담겨 있는 데이터가 잘 나오는지?
 *          1-4)-3. index[0]의 데이터가 리턴돼서 잘 뽑히는지 확인하기
 *          1-4)-4. 조건문을 사용해서 먼저 판별해준다.
 *              -> index[i]의 시작점은 index[1]이기 때문에 그 값은 3이된다.
 *              Q1 : if (3 > ?) 어떤 값을 판별해서 진행하면 좋을까?
 *                  A : index[0]의 값은 7이기 때문에
 *                      -> if (arr[i] > arr[i-1])을 해줘야
 *                      -> if (3 > 7)을 비교할 수 있다. 이렇게 해야 '바로 앞의 수'보다 큰 수로만
 *                      -> 누적해서 리턴 변수에 값을 넣을 수 있다.
 */

/**
 *  1. 해결방법
 *      1-1) 입력받은 배열의 리턴 type을 정해주기
 *          -> ArrayList<Integer>임.
 *      1-2) index[0] 값을 리턴 변수에 넣기(List에 넣기)
 *          -> index[0] 값은 출력되기 때문에
 *      1-3) for문 배열의 값을 조회하기
 *          -> index[0]의 값은 변수에 담았기에
 *          -> for문의 시작은 int = 1.
 *      1-4) 데이터가 잘 뽑히는지 출력하기
 *      1-5) 출력값을 담기 위해 조건문으로 바로 앞의 수보다 큰지 판별하기
 *          -> 생각정리 내용과 동일
 *          1-5)-1. 리턴 변수에 담아주기.
 *
 */
public class ArrayListForEachPoint {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];

		// 1-1) 입력 받은 6개의 숫자를 배열에 담는다.
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		ArrayListForEachPoint main = new ArrayListForEachPoint();
		for (int x : main.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private ArrayList<Integer> solution(int n, int[] arr) {

		// 1-1) 입력받은 배열의 리턴 type을 정해주기
		ArrayList<Integer> answer = new ArrayList<>();

		// 1-2) index[0] 값을 리턴 변수에 넣기(List에 넣기)
		answer.add(arr[0]);

		// 1-3) for문 배열의 값을 조회하기
		for (int i = 1; i < arr.length; i++) {
			// 1-4) 데이터가 잘 뽑히는지 출력하기
			System.out.print(arr[i] + " ");

			// 1-5) 출력값을 담기 위해 조건문으로 바로 앞의 수보다 큰지 판별하기
			if (arr[i] > arr[i-1]) {
				// 1-5)-1. 리턴 변수에 담아주기
				answer.add(arr[i]);
			}
		}
		return answer;
	}
}