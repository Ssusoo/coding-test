//package _2.array._6;
//
//
//import java.util.Scanner;
//
///**
// * 6th, 뒤집은 소수
// *
// * 1. 설명
// *  N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면
// *  그 소수를 출력하는 프로그램. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
// *  그러면 23을 출력한다. 단, 910을 뒤집으면 19로 숫자화해야한다.
// *  첫 자리부터 연속된 0은 무시한다.
// *
// * 2. 출력설명
// *  첫 줄에 뒤집은 소수를 출력한다. 출력순서는 입력된 순서대로 출력함.
// *
// * 3. 입력예제 : 9 ||| 32, 55, 62, 20, 250, 370, 200, 30, 100 출력예제 : 23, 2, 73, 2, 3
// *
// * 4. 생각정리
// *  4-1)
// */
//public class Main {
//	public static void main(String[] args) {
//	Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = kb.nextInt();
//		}
//		Main main = new Main();
//
//		for (char x : main.solution(n, arr)) {
//			System.out.println(x);
//		}
//	}
//
//	private int solution(int n, int[] arr) {
//		int answer = 0;
//
//		return answer;
//	}
//}
