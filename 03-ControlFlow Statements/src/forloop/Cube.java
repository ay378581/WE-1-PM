package forloop;

public class Cube {

	public static void main(String[] args) {

		int num = 371;
		int count = 0;
		int finalAns = 0;

		for (int temp = num; temp > 0; temp /= 10) 
		{
			count++;
		}		
		for (int sh = num; sh > 0; sh /= 10) {
			int rem = sh % 10;
			int ans = 1;
			for (int i = 1; i <= count; i++) {
				ans *= rem;
			}

			finalAns += ans;
		}
		if (finalAns == num)
			System.out.println(num + " is an ArmStrong Number");
		else
			System.out.println(num + " is not an ArmStrong Number");
	}
}
