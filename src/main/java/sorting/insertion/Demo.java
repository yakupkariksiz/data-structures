package sorting.insertion;

public class Demo {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        InsertionSort is = new InsertionSort();
        is.sort(intArray);
    }
}
