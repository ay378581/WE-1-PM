package test;

public class Demo {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;

		if (a++ == b)
			System.out.println(a++);

		else if (a++ == b)
			System.out.println(a++);

		else if (a++ == b)
			System.out.println(a++);

		else if (a++ == b)
			System.out.println(a++);

		else if (a++ == b)
			System.out.println(a++);
		else
			System.out.println(--a);

		System.out.println(a);
	}
}
