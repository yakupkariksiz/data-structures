package sorting.quicksort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quicksort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(array, start, end);
        quicksort(array, start, pivotIndex);
        quicksort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int i = start;
        int j = end;
        int pivotElement = array[start];
        while (i < j) {

            while (i < j && array[--j] >= pivotElement);
            if (i < j) {
                array[i] = array[j];
            }
            while (i < j && array[++i] <= pivotElement);
            if (i < j) {
                array[j] = array[i];
            }

        }

        array[j] = pivotElement;
        return j;

    }


}
