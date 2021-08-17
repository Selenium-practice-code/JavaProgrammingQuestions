package JavaPQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateElementsinAnArray {

	/*
	 * 1. brute Force (using for loop) 2. HashSet 3. HashMap<Key, value> (compare
	 * key and value) 4. streams
	 */

	public static void main(String[] args) {

		String arr[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "SauceLabs", "GCP", "Azure" };
		// String arr[] = {"a", "b", "c"};

		boolean flag = false;

		System.out.println("**********Brute Force Method********");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {

					System.out.println("Duplicate value is: " + arr[i]);
					flag = true;
				}
			}
		}

		if (flag == false) {

			System.out.println("Duplicate value not found");
		}

		System.out.println("**********Hash Set********");

		Set<String> data = new HashSet<String>();

		for (String e : arr) {

			if (data.add(e) == false) {

				System.out.println("Duplicate value is: " + e);
				flag = true;

			}
		}

		if (flag == false) {

			System.out.println("Duplicate value not found");
		}

		System.out.println("**********Hash Map********");

		// Create one hash map

		Map<String, Integer> arrMap = new HashMap<String, Integer>(); // Integer -> repetitive(how many repetition are
																		// coming bases on Integer)

		for (String e : arr) {

			Integer count = arrMap.get(e);
			if (count == null) { // First time nothing got added than i add the data in my map

				arrMap.put(e, 1); // value as e and simple add it first tym 1

			}

			else {

				arrMap.put(e, ++count);// whatever the counter used increase the counter by 1
			}
		}

		// print the duplicate element

		Set<Entry<String, Integer>> entrySet = arrMap.entrySet();// got complete hash Map set

		for (Entry<String, Integer> entry : entrySet) { // entry set give u all the pairs all the set of the hash map in
														// the form of entrySet

			// now iterating particular entrySet

			// put the condition whatever the entry that we have captured from the entry set
			if (entry.getValue() > 1) { // value means value will be given in form of integer if it is > 1 means here is
										// duplicate entry

				System.out.println("Duplicate value is : " + entry.getKey()); // actual value storing on this key total
																				// No o repetition in form off Integer
																				// as a value
				flag = true;
			}

		}

		if (flag == false) {

			System.out.println("Duplicate value not found");
		}

		System.out.println("**********Streams********");

		Set<String> dataSet = new HashSet<String>();

		Set<String> dupSet = Arrays.asList(arr).stream().filter(e -> !dataSet.add(e)).collect(Collectors.toSet()); // collect
																													// will
																													// return
																													// one
																													// set
																													// of
																													// String

		System.out.println("Duplicate value is : " + dupSet);
	}

}
