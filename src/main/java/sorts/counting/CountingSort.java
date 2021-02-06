package sorts.counting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        int min = getMin(array, Integer.MAX_VALUE);
        int max = getMax(array, Integer.MIN_VALUE);

        //countingSort1(array, min, max);
        countingSort2(array, min, max);

        System.out.println(Arrays.toString(array));
    }

    private static int getMax(int[] array, int max) {
        // find max
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int getMin(int[] array, int min) {
        // find min
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static void countingSort1(int[] array, int min, int max) {
        int[] countingSortArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countingSortArray[array[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countingSortArray[i - min] > 0) {
                array[j++] = i;
                countingSortArray[i - min]--;
            }
        }
    }

    private static void countingSort2(int[] array, int min, int max) {
        int[] countingSortArray = new int[(max - min) + 1];

        // create the countArray that keeps each item count.
        for (int i = 0; i < array.length; i++) {
            countingSortArray[array[i] - min]++;
        }

        System.out.println(Arrays.toString(countingSortArray));

        // create the updated countArray that keeps place of each item in the original array
        for (int i = 1; i < countingSortArray.length; i++) {
            countingSortArray[i] += countingSortArray[i - 1];
        }

        System.out.println(Arrays.toString(countingSortArray));

        int[] temp = new int[array.length];
        // traverse original array to create a new sorted temp array.
        for (int i = array.length - 1; i >= 0; i--) {
            temp[--countingSortArray[array[i] - min]] = array[i];
        }

        System.out.println("temp : " + Arrays.toString(temp));

        // traverse the temp array to copy sorted values to original array
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }

        System.out.println("Array : " + Arrays.toString(array));
    }
}
