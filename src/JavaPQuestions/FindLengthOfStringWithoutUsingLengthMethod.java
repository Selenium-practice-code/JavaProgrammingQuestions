package JavaPQuestions;

public class FindLengthOfStringWithoutUsingLengthMethod {

    public static void main(String[] args) {
        String str = "testing";

        System.out.println(str.toCharArray().length);
        System.out.println(str.lastIndexOf(""));
    }
}
