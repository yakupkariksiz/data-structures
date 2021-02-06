package stacks;

public class ArrayStackDemo {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("yakup", "kariksiz", 1));
        stack.push(new Employee("esra", "kariksiz", 1));
        stack.push(new Employee("erdem", "kariksiz", 1));

        //System.out.println(stack.peek());

        stack.print();

        System.out.println("***************\n***************\n***************\n***************");
        System.out.println("Popped: " + stack.pop());
        System.out.println("***************\n***************\n***************\n***************");
        System.out.println("Popped: " + stack.pop());
    }
}
