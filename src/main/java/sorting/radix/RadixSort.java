package sorting.radix;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        System.out.println("Original array : " + Arrays.toString(radixArray));
        radixSort(radixArray, 10, 4);
        System.out.println("Sorted array : " + Arrays.toString(radixArray));

    }

    public static void radixSort(int[] input, int radix, int width) {

        for (int position = 0; position < width; position++) {
            radixSortSingle(input, position, radix);
        }
    }

    private static void radixSortSingle(int[] input, int position, int radix) {
        int[] countingArray = new int[radix];

        for (int i = 0; i < input.length; i++) {
            countingArray[getDigit(input[i], position, radix)]++;
        }

        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i - 1];
        }

        int[] temp = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            temp[--countingArray[getDigit(input[i], position, radix)]] = input[i];
        }

        for (int i = 0; i < temp.length; i++) {
             input[i] = temp[i];
        }

    }

    private static int getDigit(int value, int position, int radix) {
        return value / (int) (Math.pow(10, position)) % radix;
    }

}
