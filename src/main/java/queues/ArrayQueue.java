package queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    Employee[] queue;
    int front;
    int back;

    ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    void add(Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee removed = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return removed;
    }

    Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    int size() {
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                Employee employee = queue[i];
                System.out.println(employee);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                Employee employee = queue[i];
                System.out.println(employee);
            }
            for (int i = 0; i < back; i++) {
                Employee employee = queue[i];
                System.out.println(employee);
            }
        }
    }
}
