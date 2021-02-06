package stacks;

import java.util.LinkedList;
import java.util.ListIterator;

class LinkedStack {

    LinkedList<Employee> stack;

    LinkedStack() {
        stack = new LinkedList<>();
    }

    void push(Employee employee) {
        stack.push(employee);
    }

    Employee pop() {
        return stack.pop();
    }

    Employee peek() {
        return stack.peek();
    }

    int size() {
        return stack.size();
    }

    void print() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
