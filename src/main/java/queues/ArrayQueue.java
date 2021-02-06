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
        if (back == queue.length) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee removed = queue[front];
        queue[front] = null;
        front++;
        return removed;
    }

    Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    int size() {
        return back - front;
    }

    void printQueue() {
        for (int i = front; i < back; i++) {
            Employee employee = queue[i];
            System.out.println(employee);
        }
    }

}
