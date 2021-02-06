package sorts.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int midPoint = (start + end) / 2;
        mergeSort(array, start, midPoint);
        mergeSort(array, midPoint, end);
        merge(array, start, midPoint, end);
    }

    private static void merge(int[] array, int start, int midPoint, int end) {

        if (array[midPoint - 1] <= array[midPoint]) {
            return;
        }

        int i = start;
        int j = midPoint;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < midPoint && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, midPoint - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
