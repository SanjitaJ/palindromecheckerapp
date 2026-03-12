import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class palindromecheckerapp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}