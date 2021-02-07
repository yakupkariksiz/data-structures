package queues;

public class QueueDemo {

    public static void main(String[] args) {

        Employee oldest = new Employee("old", "oldlast", 90);
        Employee older = new Employee("older", "olderlast", 85);
        Employee mid = new Employee("mid", "midlast", 60);
        Employee young = new Employee("young", "younglast", 40);
        Employee youngest = new Employee("youngest", "youngestlast", 30);

        ArrayQueue queue = new ArrayQueue(5);

        /*
        queue.add(oldest);
        queue.add(older);
        queue.remove();
        queue.add(mid);
        queue.remove();
        queue.add(young);
        queue.remove();
        queue.add(youngest);
        queue.remove();
        queue.add(oldest);

        queue.printQueue();
        */

        queue.add(oldest);
        queue.add(older);
        queue.add(mid);
        queue.add(young);
        queue.add(youngest);
        queue.printQueue();
    }
}
