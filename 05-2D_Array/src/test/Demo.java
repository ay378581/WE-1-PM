package test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int arr[][] = new int[num][num];

		System.out.println("Enter " + num * num + " Elements : ");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++)
				arr[i][j] = sc.nextInt();
		}

		System.out.println("\n***********Your Given 2D Array is ***********\n");

		int zero = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (arr[i][j] == 0)
					zero++;

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println("\nZero's Elements : " + zero);
		System.out.println("Non Zero Elements : " + ((num * num) - zero));
	}
}
