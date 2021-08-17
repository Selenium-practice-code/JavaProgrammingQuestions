package JavaPQuestions;

public class PrintFrom1To100WithoutUsingAnyNumbers {

	public static void main(String[] args) {

		int one = 'A' / 'A';

		String s1 = "..........";

		// Method 1
		for (int i = one; i <= s1.length() * s1.length(); i++) {

			System.out.println(i);
		}

		// Method 2

		// using ASCII value D= 100

		System.out.println("--------------------");

		for (int i = one; i <= 'd'; i += one) {

			System.out.println(i);
		}
	}

}
