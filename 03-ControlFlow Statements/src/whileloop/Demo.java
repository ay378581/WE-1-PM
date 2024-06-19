package whileloop;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";

		int i = 1;
		while (i <= 5) {

			System.out.println("Enter Your Name : ");
			String name = sc.next();
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			System.out.println("Enter Your Salary : ");
			float salary = sc.nextFloat();

			ans += name + "\n" + age + "\n" + salary + "\n****************\n";
			i++;
		}
		System.out.println("************Your Entered Data******************");
		System.out.println(ans);
	}
}
