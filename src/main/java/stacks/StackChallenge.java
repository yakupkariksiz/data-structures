package stacks;

import java.util.ListIterator;

class StackChallenge {

    LinkedCharStack linkedStack;

    public StackChallenge() {
        linkedStack = new LinkedCharStack();
    }

    public static void main(String[] args) {

        StackChallenge sc = new StackChallenge();
        System.out.println("Check palindrome for \"I did, did I?\"" + " : " + sc.isPalindrome("I did, did I?"));
        System.out.println("Check palindrome for \"Racecar\"" + " : " + sc.isPalindrome("Racecar"));
        System.out.println("Check palindrome for \"Hello\"" + " : " + sc.isPalindrome("Hello"));
        System.out.println("Check palindrome for \"gittig\"" + " : " + sc.isPalindrome("gittig"));

    }

    private boolean isPalindrome(String original) {
        String lowerCase = original.toLowerCase();
        StringBuilder originalWithoutPunctuation = new StringBuilder(original.length());

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                originalWithoutPunctuation.append(c);
                linkedStack.stack.push(c);
            }
        }

        String originalValue = originalWithoutPunctuation.toString();
        ListIterator<Character> iterator = linkedStack.stack.listIterator();
        StringBuilder reversedB = new StringBuilder();

        while (!linkedStack.stack.isEmpty()) {
            reversedB.append(linkedStack.stack.pop());
        }

        String reversedValue = reversedB.toString();

        return originalValue.equals(reversedValue);
    }

}

