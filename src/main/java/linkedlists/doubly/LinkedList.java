package linkedlists.doubly;

public class LinkedList {

    public static void main(String[] args) {
        Employee reda = new Employee("Reda", "Ader", 44);
        Employee bluea = new Employee("Bluea", "Aeulb", 61);
        Employee yellowa = new Employee("Yellowa", "Awolley", 444);
        Employee green = new Employee("Green", "Neerg", 34);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(reda);
        list.addToFront(bluea);
        list.addToFront(yellowa);
        list.addToFront(green);

        list.printList();
        System.out.println(list.getSize());

        Employee slacka = new Employee("Slack", "Kcwict", 32);
        list.addToEnd(slacka);
        System.out.println("------------------");
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        System.out.println("------------------");
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        System.out.println("------------------");
        list.printList();
        System.out.println(list.getSize());

    }
}
