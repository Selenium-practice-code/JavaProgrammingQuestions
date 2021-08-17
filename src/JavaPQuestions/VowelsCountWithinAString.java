package JavaPQuestions;

import java.util.function.IntPredicate;

public class VowelsCountWithinAString {

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }

    public static void main(String[] args) {

        String str = "aeiou";
        int count = 0;

        for (int x = 0; x < str.length(); x++) {
            if (isVowel(str.charAt(x))) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("Java Streams");

        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                        t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
            }
        };

        String test = "Sumit Parcticing Java";
        long vCount = test.chars().filter(vowel).count();
        System.out.println(vCount);
    }
}
