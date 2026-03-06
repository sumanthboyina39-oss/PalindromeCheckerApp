import java.util.Scanner;

class PalindromeChecker {


    public boolean checkPalindrome(String input) {

        if (input == null) return false;


        String normalized = normalize(input);


        char[] arr = normalized.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    private String normalize(String str) {
        return str.toLowerCase().replaceAll("\\s+", "");
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        PalindromeChecker checker = new PalindromeChecker();


        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        sc.close();
    }
}