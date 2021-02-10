package hashtables;

public class Demo {

    public static void main(String[] args) {
        Employee kadirSavun = new Employee("kadir" , "savun", 1);
        Employee fikretHakan = new Employee("fikret", "hakan", 2);
        Employee ozturkSerengil = new Employee("ozturk", "serengil", 3);
        Employee edizHun = new Employee("ediz", "hun", 4);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(kadirSavun);
        hashTable.put(ozturkSerengil);
        hashTable.put(edizHun);
        hashTable.put(fikretHakan);

        hashTable.print();
        System.out.println("****\n****\n****");
        hashTable.remove(kadirSavun.getLastName());
        hashTable.print();
    }
}
