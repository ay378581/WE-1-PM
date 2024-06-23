package test;

import java.util.Scanner;

public class ArmStrong {

	static int length(int num) {
		int len = 0;

		while (num > 0) {
			len++;
			num /= 10;
		}

		return len;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int temp = num;
		int ans = 0;

		while (temp > 0) {
			int rem = temp % 10;
			int cube = 1;

			for (int i = 1; i <= length(num); i++)
				cube = cube * rem;

			ans += cube;

			temp /= 10;
		}

		if (ans == num)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Natural Number");

	}

}
