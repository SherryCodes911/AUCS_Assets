package DSA_Lab_06_Ahtisham;

/**
 * Lab Task 01:
 * ● Write a Java program to implement the Bubble Sort algorithm. Your task is to sort an
 * array of integers in ascending order using Bubble Sort.
 * ● Define a method bubbleSort(int[] arr) that takes an array as input and sorts it using the
 * Bubble Sort algorithm.
 * Input: 513462
 * Output: 123456
 */
public class Lab_Task_01 {
    /**
     * This code has efficient runtime
     * public int[] bubbleSort(int[] arr) {
     * int numberOfOperations = 0;
     * for (int i = 0; i < arr.length - 1; i++) {
     * for (int j = 0; j < arr.length - i - 1; j++) {
     * if (arr[j] > arr[j + 1]) {
     * int temp = arr[j];
     * arr[j] = arr[j + 1];
     * arr[j + 1] = temp;
     * }
     * numberOfOperations++;
     * }
     * }
     * System.out.println("Number of operations: " + numberOfOperations);
     * return arr;
     * }
     */

    /**
     * Another way to sort using i-index
     * public int[] bubbleSort(int[] arr) {
     * int numberOfOperations = 0;
     * for (int i = 0; i < arr.length - 1; i++) {
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[i] > arr[j]) {
     * int temp = arr[i];
     * arr[i] = arr[j];
     * arr[j] = temp;
     * }
     * numberOfOperations++;
     * }
     * }
     * System.out.println("Number of operations took to solve " + arr.length + " length of array is: " + numberOfOperations);
     * return arr;
     * }
     */
    public int[] bubbleSort(int[] arr) {
        int numberOfOperations = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                numberOfOperations++;
            }
        }
        System.out.println("Number of operations took to solve " + arr.length + " length of array using Bubble Sort is: " + numberOfOperations);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 6, 2};

        System.out.println("Array before sorting: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();

        arr = new Lab_Task_01().bubbleSort(arr);
        System.out.println("Array after sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

