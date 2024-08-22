package Lab01_Ahtisham;
//Lab Task 2: Insertion in Arrays
//Objective: Practice inserting elements at different positions in an array.

/**
 * Exercise 1: Insert an element at the start of the array.
 * •	Start with the array {12, 24, 36, 48, 60}.
 * •	Insert the value 6 at the beginning.
 * Expected output:
 * 6 12 24 36 48 60
 */
public class Task_02_Exercise_01 {
    public static void main(String[] args) {
        int[] arr = new int[6]; // Created a 1 memory extra array to insert One element at any index
        arr[0] = 12;
        arr[1] = 24;
        arr[2] = 36;
        arr[3] = 48;
        arr[4] = 60;

        int currentLengthOfArray = arr.length - 1;

        System.out.println("Array Before insertion:");
        for (int i = 0; i < currentLengthOfArray; i++) {// Iterating till current index because array is not totally filled
            System.out.print(arr[i] + " ");
        }

        int indexWhereInsertNewElement = 0;
        for (int i = arr.length - 1; i >= indexWhereInsertNewElement; i--) {
            arr[i] = arr[i - 1];    // Shifting to create space where to insert.
        }

        arr[indexWhereInsertNewElement] = 6; // Now inserting at index 0

        System.out.println("\nArray after insertion:");
        for (int j : arr) {
            System.out.print(j + " "); // Finally printing after insertion
        }

    }
}
