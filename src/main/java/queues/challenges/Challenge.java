package queues.challenges;

import java.util.LinkedList;
import java.util.Locale;

public class Challenge {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public static boolean checkForPalindrome(String value) {

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        String lowerCase = value.toLowerCase(Locale.ENGLISH);
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }

    static boolean checkForPalindrome2(String value) {
        String lowerCase = value.toLowerCase(Locale.ENGLISH);
        StringBuilder originalString = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                originalString.append(c);
            }
        }

        StringBuilder reversedString = new StringBuilder();
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                reversedString.append(c);
            }
        }

        return originalString.toString().equals(reversedString.toString());
    }
}
