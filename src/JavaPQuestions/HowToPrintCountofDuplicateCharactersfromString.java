package JavaPQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HowToPrintCountOfDuplicateCharactersFromString {
    public static void main(String[] args) {

        printDuplicateChars("A");
        printDuplicateChars("");
        printDuplicateChars(null);
        printDuplicateChars("Java");
        printDuplicateChars("Sumit");
        printDuplicateChars("10000");

    }

    public static void printDuplicateChars(String str) {

        //Writing the Negative Test Cases
        if (str == null) {
            System.out.println("Null String");
            return;
        }
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        if (str.length() == 1) {
            System.out.println("Single Char String");
            return;
        }

        char arr[] = str.toCharArray(); // java
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch : arr) {
            if (charMap.containsKey(ch)) {

                charMap.put(ch, charMap.get(ch) + 1);

            } else {
                charMap.put(ch, 1);
            }
        }

        // Print the Map:
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Value is : " + entry.getKey() + ":" + entry.getValue());
            }
        }

    }


}
