package DSA_Lab_06_Ahtisham;

/**
 * Lab Task 02: Implement Optimized Bubble Sort with Early Stopping
 * ● Write a Java program to implement an optimized version of the Bubble Sort algorithm
 * that stops early if the array is already sorted during any pass through the array.
 * ● Define a method earlyStopBubbleSort(int[] arr) that implements Bubble Sort.
 */
public class Lab_Task_02 {
    public int[] optimizedBubbleSort(int[] arr) {
        int numberOfOperations = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                numberOfOperations++;
                if (!swapped)
                    break;
            }

        }
        System.out.println("Number of operations took to solve " + arr.length + " length of array using Optimized Bubble Sort are: " + numberOfOperations);


        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0, 10};

        System.out.println("Array before sorting:");
        for (int k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();

        arr = new Lab_Task_02().optimizedBubbleSort(arr);
        System.out.println("Array after sorting:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
