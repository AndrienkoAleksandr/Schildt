package collection.some_Algoritms_arrays;

import java.util.Arrays;

/**
 * Created by USER on 12.06.2014.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        dysplay(array);
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        dysplay(array);
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill: ");
        dysplay(array);
        Arrays.sort(array);
        System.out.print("After second sort: ");
        dysplay(array);
        System.out.print("value -9 situated in position: ");
        int i = Arrays.binarySearch(array, -9);
        System.out.print(i);
    }
    public static void dysplay(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
