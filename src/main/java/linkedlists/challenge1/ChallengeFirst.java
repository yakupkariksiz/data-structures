package linkedlists.challenge1;

import linkedlists.doubly.Employee;
import linkedlists.doubly.EmployeeDoublyLinkedList;

// Implement the addBefore() method for the EmployeeDoubleLinkedList class.
public class ChallengeFirst {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();

        System.out.println(list.addBefore(billEnd, johnDoe));
        System.out.println(list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson));
        System.out.println(list.addBefore(new Employee("Micheal", "Jordan", 23), new Employee("Charles", "Barkley", 34)));
        list.printList();

    }

}
