package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Reda", "Ader", 44));
        employees.add(new Employee("Bluea", "Aeulb", 61));
        employees.add(new Employee("Yellowa", "Awolley", 444));
        employees.add(new Employee("Green", "Neerg", 34));

        employees.forEach(System.out::println);
        Object[] objects = employees.toArray();
        Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
        System.out.println(Arrays.toString(employeeArray));

        System.out.println("----------------------------");
        employees.set(3, new Employee("Purple", "Elprup", 17));
        employees.add(3, new Employee("Green", "Neerg", 34));
        System.out.println(employees);
        int index = employees.indexOf(new Employee("Green", "Neerg", 34));
        System.out.println(index);
        Employee remove = employees.remove(3);
        System.out.println("------------------");
        System.out.println("Removed employee : " + remove);
        System.out.println(employees);
    }

}
