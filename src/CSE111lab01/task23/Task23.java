package CSE111lab01.task23;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int n = sc.nextInt();

		for (int i = 1; i <= 2; i++) {
			int j = 1;
			for (; j <= n - i; j++) {
				String space = " ";
				System.out.print(space);
			}
			for (int star = j; star <= n; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int k = n - 2;
		for (int a = 3; a < n; a++) {
			int s = 1;
			for (; s < k; s++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			for (int d = k + 1; d < n; d++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			System.out.println();
			k--;
		}
		for (int z = 1; z <= n; z++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
