package stacks;

import java.util.EmptyStackException;

class ArrayStack {

    Employee[] stack;
    int top;

    ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    void push(Employee employee) {
        if (top == stack.length) {
            // need to resize the backing array
            Employee[] resizedArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, resizedArray, 0, stack.length);
            stack = resizedArray;
        }

        stack[top++] = employee;
    }

    Employee pop() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        Employee removed = stack[--top];
        stack[top] = null;
        return removed;
    }

    Employee peek() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        Employee employee = stack[top - 1];
        return employee;
    }

    public void print() {
        for (int i = top-1; i >= 0; i--) {
            System.out.println(String.join(",", stack[i].toString()));
        }
    }
}
