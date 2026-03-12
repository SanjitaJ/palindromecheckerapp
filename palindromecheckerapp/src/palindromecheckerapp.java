// Palindrome service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

// Main application class
public class palindromecheckerapp {

    public static void main(String[] args) {

        String text = "madam";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call the method
        boolean result = checker.checkPalindrome(text);

        if (result) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}