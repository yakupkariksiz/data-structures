package stacks;

public class LinkedStackDemo {


    public static void main(String[] args) {

        Employee erdem = new Employee("erdem", "kariksiz", 3);
        Employee esra = new Employee("esra", "kariksiz", 36);
        Employee yusuf = new Employee("yusuf", "kariksiz", 42);
        Employee nezahat = new Employee("nezahat", "kariksiz", 59);
        Employee serif = new Employee("serif", "kariksiz", 66);
        Employee yunus = new Employee("yunus", "kariksiz", 39);
        Employee yakup = new Employee("yakup", "kariksiz", 35);

        LinkedStack stack = new LinkedStack();

        stack.push(erdem);
        stack.push(esra);
        stack.push(yusuf);
        stack.push(nezahat);
        stack.push(serif);
        stack.push(yunus);
        stack.push(yakup);
        stack.print();

        System.out.println("***\n***\n***");
        System.out.println("Peeked : " + stack.peek());

        System.out.println("***\n***\n***");

        System.out.println("Popped : " + stack.pop());
        System.out.println("***\n***\n***");

        stack.print();
    }
}
