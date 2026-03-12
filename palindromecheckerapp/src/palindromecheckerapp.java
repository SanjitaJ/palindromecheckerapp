import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class palindromecheckerapp {

    // Stack-based palindrome check
    public static boolean stackPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String word) {
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

    public static void main(String[] args) {

        String word = "madaminedenimadam";

        // Measure Stack algorithm time
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long endStack = System.nanoTime();

        // Measure Deque algorithm time
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        long endDeque = System.nanoTime();

        // Display results
        System.out.println("Stack Result: " + stackResult);
        System.out.println("Stack Execution Time: " + (endStack - startStack) + " ns");

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + (endDeque - startDeque) + " ns");
    }
}