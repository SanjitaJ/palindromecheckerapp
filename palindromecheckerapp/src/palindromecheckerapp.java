public class palindromecheckerapp {

    public static void main(String[] args) {

        String text = "Madam In Eden Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(text + " is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}