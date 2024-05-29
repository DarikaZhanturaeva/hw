import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {6.3, 5.3, -9.3, 9.2, 3.7, 9.4, -2.4, 7.2, -5.2, 11.4, -4.2, -8.4, 9.3, -8.4, 2.4};
        boolean negative = false;
        double sum = 0;
        int count = 0;

        for (double i : numbers) {
            if (negative && i > 0) {
                sum += i;
                count++;
            }
            if (i < 0) {
                negative = true;
            }
        }

        double avg = sum / count;
        System.out.println("Average arithmetic: " + avg);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for a palindrome:");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("\\s", "").toLowerCase();
        if (isPalindrome(cleanInput)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
