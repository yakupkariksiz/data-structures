package linkedlists.singly;

public class LinkedList {

    public static void main(String[] args) {
        Employee reda = new Employee("Reda", "Ader", 44);
        Employee bluea = new Employee("Bluea", "Aeulb", 61);
        Employee yellowa = new Employee("Yellowa", "Awolley", 444);
        Employee green = new Employee("Green", "Neerg", 34);

        EmployeeSinglyLinkedList employeeLinkedList = new EmployeeSinglyLinkedList();

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(reda);
        employeeLinkedList.addToFront(bluea);
        employeeLinkedList.addToFront(yellowa);
        employeeLinkedList.addToFront(green);

        System.out.println(employeeLinkedList.isEmpty());
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();

        System.out.println("---------------------");
        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printList();

    }
}
