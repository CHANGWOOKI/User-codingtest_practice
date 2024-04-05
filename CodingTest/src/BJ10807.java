import java.util.Scanner;

public class BJ10807 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 정수의 개수 a 입력
		int a = scanner.nextInt();
		// 입력 받은 정수를 number 배열에 넣기
		int[] number = new int[a];

		// 정수 배열 입력
		for (int i = 0; i < a; i++) {
			number[i] = scanner.nextInt();
		}

		// 찾으려는 정수 b 입력
		int b = scanner.nextInt();

		// v의 개수 카운트
		int count = 0;
		for (int i = 0; i < a; i++) {
			if (number[i] == b) {
				count++;
			}
		}

		System.out.println(count);
	}
}
