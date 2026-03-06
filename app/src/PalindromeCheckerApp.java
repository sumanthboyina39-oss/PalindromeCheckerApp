import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "refer";
        boolean isPalindrome = true;

        Deque<Character> deque = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            deque.add(c);
            stack.push(c);
        }

        while (!deque.isEmpty()) {
            if (!deque.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}