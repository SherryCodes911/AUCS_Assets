package Lab01_Ahtisham;
//Lab Task 2: Insertion in Arrays
//Objective: Practice inserting elements at different positions in an array.

/**
 * Exercise 2: Insert an element in the middle of the array.
 * •	Start with the array {100, 200, 300, 400, 500}.
 * •	Insert the value 250 at the 2nd index.
 * Expected output:
 * 100 200 250 300 400 500
 */

public class Task_02_Exercise_02 {
    public static void main(String[] args) {
        int[] array = new int[6]; // Created a 1 memory extra array to insert One element at any index
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;

        int currentLengthOfArray = array.length - 1;

        System.out.println("Array Before insertion:");
        for (int i = 0; i < currentLengthOfArray; i++) {// Iterating till current index because array is not totally filled
            System.out.print(array[i] + " ");
        }

        int indexWhereInsertNewElement = 2;
        for (int i = array.length - 1; i >= indexWhereInsertNewElement; i--) {
            array[i] = array[i - 1];    // Shifting for inserting
        }

        array[indexWhereInsertNewElement] = 250; // Now inserting at defined index

        System.out.println("\nArray after insertion:");
        for (int j : array) {
            System.out.print(j + " "); // Finally printing after insertion
        }


    }
}
