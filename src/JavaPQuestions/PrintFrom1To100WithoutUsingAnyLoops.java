package JavaPQuestions;

import java.util.stream.IntStream;

public class PrintFrom1To100WithoutUsingAnyLoops {

	public static void main(String[] args) {

		/*
		 * 1. Recursive function -- the function will call the itself 2.java streams
		 */

//		printNum(1);
//
//		System.out.println("************************");
//
//		printNumber(1, 100);

		// java Streams
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}

	public static void printNum(int num) {

		if (num <= 100) {

			System.out.println(num); // 1 2 3....100
			num++;
			printNum(num);
		}
	}

	public static void printNumber(int stNum, int endNum) {

		if (stNum <= 100) {

			System.out.println(stNum); // 1 2 3....100
			stNum++;
			printNumber(stNum, endNum);
		}

	}

}
