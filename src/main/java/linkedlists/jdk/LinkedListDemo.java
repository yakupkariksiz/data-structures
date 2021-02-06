package linkedlists.jdk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        Employee reda = new Employee("reda", "ader", 44);
        Employee blacka = new Employee("blacka", "akclab", 34);
        Employee slacka = new Employee("slacka", "redblue", 17);
        Employee tlacka = new Employee("tlacka", "blacksea", 21);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(reda);
        list.addFirst(blacka);
        list.addFirst(slacka);
        list.addFirst(tlacka);

        Iterator<Employee> iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            Employee employee = iter.next();
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.add(new Employee("Wraks", "Rugın", 11));
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            Employee employee = iter.next();
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            Employee employee = iter.next();
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            Employee employee = iter.next();
            System.out.print(employee);
            System.out.print(" <=> ");
        }
        System.out.println("null");
    }
}
