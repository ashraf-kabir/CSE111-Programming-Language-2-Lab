package CSE111lab01.task02;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row's range: ");
		int row = sc.nextInt();
		System.out.println("Enter column's range: ");
		int col = sc.nextInt();

		for (int a = 1; a <= row; a++) {
			for (int b = 1; b <= col; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
