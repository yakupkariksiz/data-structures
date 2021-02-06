package linkedlists.doubly;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (null == tail) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(tail.getNext());
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" NODE <=> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {
        EmployeeNode current = head;

        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
        newEmployeeNode.setNext(current);
        newEmployeeNode.setPrevious(current.getPrevious());
        if (current.getPrevious() == null) {
            head = newEmployeeNode;
        } else {
            current.getPrevious().setNext(newEmployeeNode);
        }
        current.setPrevious(newEmployeeNode);
        size++;
        return true;
    }
}
