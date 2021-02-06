package sorts.shell;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < array.length; i++) {

                int newItem = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newItem) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newItem;
            }
        }
        return array;
    }

}
