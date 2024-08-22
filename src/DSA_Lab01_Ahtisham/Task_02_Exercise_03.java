package DSA_Lab01_Ahtisham;

//Lab Task 2: Insertion in Arrays
//Objective: Practice inserting elements at different positions in an array.

/**Exercise 3: Insert an element at the end of the array.
 •	Start with the array {3, 6, 9, 12, 15}.
 •	Insert the value 18 at the end.
 Expected output:
 3 6 9 12 15 18
 */

 public class Task_02_Exercise_03 {
    public static void main(String[] args) {
        int[] array = new int[6]; // Created a 1 memory extra array to insert One element at any index
        array[0] = 3;
        array[1] = 6;
        array[2] = 9;
        array[3] = 12;
        array[4] = 15;

        int currentLengthOfArray = array.length - 1;

        System.out.println("Array Before insertion:");
        for (int i = 0; i < currentLengthOfArray; i++) {// Iterating till current index because array is not totally filled
            System.out.print(array[i] + " ");
        }

        int indexWhereInsertNewElement = array.length - 1; // for inserting at last index
        array[indexWhereInsertNewElement] = 18; // Now inserting at last index

        System.out.println("\nArray after insertion:");
        for (int j : array) {
            System.out.print(j + " "); // Finally printing after insertion
        }

    }
}
