package test;

public class Test {

	public static void main(String[] args) {
		
		int num = 7;
		int cube = 1;
		
		for(int i = 1; i <= 3; i++)
			cube *= num;
		
		System.out.println(cube);
	}
}
