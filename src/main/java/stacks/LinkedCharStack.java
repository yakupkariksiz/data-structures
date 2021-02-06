package stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedCharStack {

    LinkedList<Character> stack;

    LinkedCharStack() {
        stack = new LinkedList<>();
    }

    void push(Character character) {
        stack.push(character);
    }

    Character pop() {
        return stack.pop();
    }

    Character peek() {
        return stack.peek();
    }

    void print() {
        ListIterator<Character> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
