package _2.array._6;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6th, 뒤집은 소수(IsPrimeWhile)
 *
 * 1. 설명
 *  N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면
 *  그 소수를 출력하는 프로그램. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
 *  그러면 23을 출력한다. 단, 910을 뒤집으면 19로 숫자화해야한다.
 *  첫 자리부터 연속된 0은 무시한다.
 *
 * 2. 출력설명
 *  첫 줄에 뒤집은 소수를 출력한다. 출력순서는 입력된 순서대로 출력함.
 *
 * 3. 입력예제 : 9 ||| 32, 55, 62, 20, 250, 370, 200, 30, 100 출력예제 : 23, 2, 73, 2, 3
 *
 * 4. 생각정리
 *  4-1) 1230이라는 숫자를 어떻게 0321로 뒤집어줄 수 있을까?
 *      4-1)-1. 일반적인 나누기 연산자(/)
 *          100 / 5 = 20.
 *      4-1)-2. 나눈 후 나머지를 구하는 연산자(%)
 *          100 % 5 = 0
 *  4-2) 배열 사용하기
 *  4-3) 배열의 리턴 타입은 ArrayList를 이용한 <Integer>
 *  4-4) for문을 이용한 배열 값 조회하기
 *      4-4)-1. 입력값 1230을 받을 int 변수 선언하기
 *      4-4)-2. int 변수를 %로 나누고 뒤집어 줄 또 다른 int 변수 선언하기
 *  4-5) while문 돌리기(입력값이 0보다 클 때까지)
 *      4-5)-1. 입력값을 int로 받은 변수(1230)를 % 나누고 나눈 몫을 담을 int 변수를 선언하고 넣기
 *          -> 1230 % 10 = 0
 *          -> int t = tmp % 10
 *      4-5)-2. 숫자를 뒤집어줄 변수에 수식
 *          -> reverse = reverse(0) * 10 + t(0)
 *      4-5)-3. 입력 값을 /로 나누기
 *          -> 1230 / 10 = 123
 *          -> 123 / 10 = 12.3
 *          -> 12 / 10 = 1.2
 *          -> 1 / 10 = 0.1
 *          -> 0이기 때문에 반복문이 멈춤.
 *  4-6) 반복문 다음 구문으로 조건문으로 소수 판별하기
 *      4-6)-1. 뒤집어진 수(reverse)를 받은 변수에 수를 boolean 메소드로 해주기
 *          -> if (isPrime(reverse))
 *      4-6)-2. true 판별을 받은 변수를 리턴 변수에 담기
 *  4-7) boolean 판별 메소드
 *      4-7)-1. 조건문 파라미터가 1인 경우 false
 *
 *      4-7)-2. for문
 *          -> 조건문 파라미터가 약수인 경우 false
 *
 *      4-7)-3. 둘 다 아닌 경우가 소수임(1과 자기 자신을 갖는 수가 소수임)
 */
public class IsPrimeWhile {
	private boolean isPrime(int num) {
		if (num == 1) return false;
		for (int i = 2; i < num; i++) {
			// 약수
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		IsPrimeWhile main = new IsPrimeWhile();

		for (int x : main.solution(n, arr)) {
			System.out.println(x);
		}
	}

	private ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int tmp = arr[i];
			int reverse = 0;

			while (tmp > 0) {
				int t = tmp%10;
				reverse = reverse * 10 + t;
				tmp = tmp/10;
			}
			if (isPrime(reverse)) {
				answer.add(reverse);
			}
		}
		return answer;
	}
}