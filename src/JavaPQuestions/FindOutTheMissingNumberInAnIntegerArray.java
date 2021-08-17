package JavaPQuestions;

public class FindOutTheMissingNumberInAnIntegerArray {

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int missingNumber = findMissingNumber(num, 11);
        System.out.println("Missing Number is : " + missingNumber);
    }

    public static int findMissingNumber(int num[], int totalCount) {

        int expSum = totalCount * (totalCount + 1) / 2;
        int actualSum = 0;

        for (int i : num) {
            actualSum += i;
        }
        return expSum - actualSum;
    }
}
