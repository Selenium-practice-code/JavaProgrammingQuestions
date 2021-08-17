package JavaPQuestions;

public class CountTheOccurrencesOfACharacterInAString {
    public static void main(String[] args) {

        String str = "I love coding";
        //CharArray
        //USing Length
        //Streams

        countOfCharOccurrences(str, 'o');
        countOfCharOccurrencesByLength("o");

    }



    public static void countOfCharOccurrences(String str, char val) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == val) {
                count++;
            }
        }
        System.out.println(val + ":" + count);
    }

    public static void countOfCharOccurrencesByLength(String str) {
        int l = str.length();
        int l1 = str.replaceAll(str, "").length();
        int charCount = l - l1;
        System.out.println(charCount);

    }
}