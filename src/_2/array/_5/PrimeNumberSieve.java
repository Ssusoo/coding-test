package _2.array._5;

import _1.string._5.Main;

import java.util.Scanner;

/**
 * 5th, 소수(PrimeNumber), 에라토스테네스 체(Sieve)
 * 1. 설명
 *  1과 자기 자신을 양의 약수로 가지는 수를 가리켜 '소수'라고 부른다.
 *  양의 약수를 2개 가진다고 보면 된다. 예를 들면 2, 3, 5, 7 ,11 ... 등이 존재한다.
 *  이런 소수를 대량으로 구할 수 있는 게 바로 '에라토스테네스의 체'다.
 *
 *  소수(1과 자기자신(양의 약수를 2개 가지는 수))를 대량으로 빠르고 정확하게 구하는 방법이다.
 *  자연수 N이 입력되면 1부터 N까지의 소수 개수를 출력하는 프로그램
 *  만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19 총 8개다.
 *
 * 2. 입력설명
 *  첫 줄에 자연수의 개수 N이 주어짐.
 *
 * 3. 출력설명
 *  첫 줄에 소수의 개수를 출력함.
 *
 * 4. 입력예제 20, 출력예제 8
 *
 * 5. 생각정리
 *  5-1) 1과 자기 자신을 양의 약수로 가지는 수를 가진 소수에 대한 고민
 *      ->
 *  5-2) 0과 1을 제외시킨다.
 *      -> 소수(1과 자기자신을 갖는 양의 약수)가 아니기 때문에
 *  5-3) 소수가 아닌 것을 어떻게 판별할까?
 *      5-3)-1. ch[i] == 0이랑 같으면 소수. 카운트 시키기
 *          -> 2일 경우. 1과 자기자신을 같는 소수.
 *      5-3)-2. 소수를 뺀 나머지 배수를 제외시키기
 *          -> 이중 for문을 돌려 배수인 수는 ch = 1;로 만들어 버리기
 *          -> 2가 소수이면 나머지 배수를 체크해서 1로 바꿔주기
 *      5-3)-3. 조건문으로 소수판결한 수를
 *          ->
 */

/**
 *  1. 해결방법
 *      1-1) 리턴 type 정해주기
 *      1-2) 입력값 배열로 만들어주기
 *          Q1 : 배열로 만드는 이유?
 *              A1 : 소수를 판별하기 위해 배열로 만듦.
 *          Q2 : 해당 배열에 n+1하는 이유?
 *              A2 : 그냥 20일 경우 인덱스는 0부터 시작하기 때문에 19밖에 판별을 못함.
 *     1-3) for문으로 조회하기
 *          -> for문의 시작을 2로하기(소수가 아닌 0과 1은 제외)
 *          -> for문의 끝의 부등호를 <=로(20까지 뽑아내기 위해)
 *          1-3)-1. 조건문 i가 0이면 소수임.
 *          1-3)-2. 리턴 카운트 시키기
 *     1-4) 해당 i의 배수 제외시키기
 *          1-4)-1. 배수인 수를 0에서 1로 만들기
 */
public class PrimeNumberSieve {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		PrimeNumberSieve main = new PrimeNumberSieve();
		System.out.println(main.solution(n));
	}

	public int solution(int n) {
		// 1-1) 리턴 type 정해주기
		int answer = 0;

		// 1-2) 입력값 배열로 만들어주기
		int[] ch = new int[n+1];

		// 1-3) for문으로 조회하기
		for (int i = 2; i <= n; i++) {
			// 1-3)-1. 조건문 i가 0이면 소수임.
			if (ch[i] == 0) {
				// 1-3)-2. 리턴 카운트 시키기
				answer++;
				// 1-4) 해당 i의 배수 제외시키기
				for (int j = i; j <= n; j = j+i) {
					// 1-4)-1. 배수인 수를 0에서 1로 만들기
					ch[j]= 1;
				}
			}
		}
		return answer;
	}
}