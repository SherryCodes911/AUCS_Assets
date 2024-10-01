package DSA_Lab_06_Ahtisham;

/**
 * Lab Task 03: Sort a List of Strings by Length
 * ● Modify the Bubble Sort algorithm to sort a list of strings by their lengths in ascending
 * order.
 * Input: ["apple", "pie", "banana", "cat"]
 * Output: ["pie", "cat", "apple", "banana"]
 */
public class Lab_Task_03 {
    public String[] bubbleSort(String[] arr) {
        int numberOfOperations = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                numberOfOperations++;
            }
        }
        System.out.println("Number of operations took to solve " + arr.length + " length of String array using Bubble Sort are: " + numberOfOperations);

        return arr;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "pie", "banana", "cat"};

        System.out.println("String Array before sorting:");
        for (String k : arr) {
            System.out.print(k + " ");
        }

        System.out.println();

        arr = new Lab_Task_03().bubbleSort(arr);
        System.out.println("String Array after sorting:");
        for (String j : arr) {
            System.out.print(j + " ");
        }
    }
}
