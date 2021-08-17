package JavaPQuestions;

import java.util.Arrays;
import java.util.BitSet;

public class PrintFrom1To100WithoutUsingAnyLoopsAndReursion {

	public static void main(String[] args) {

		// 1. Arrays Fill
		Object num[] = new Object[100];

		Arrays.fill(num, new Object() {

			int count = 0; // maintain one variable

			// I am going to override toString method from object class
			@Override
			public String toString() { 
				return Integer.toString(++count); // i simple return whatevr string we are getting
			}

		});

		System.out.println(Arrays.toString(num));

		System.out.println();

		// 2. Using the concept of BitSet
		String set = new BitSet() {
			{
				set(1, 101);
			}
		}.toString();
		System.out.append(set, 1, set.length());

	}

}
