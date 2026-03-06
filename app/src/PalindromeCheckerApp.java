public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized, 0, normalized.length() - 1)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }
}