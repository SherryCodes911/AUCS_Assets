package Lab01_Ahtisham;
//Lab Task 3: Deletion in Arrays
//Objective: Learn how to delete elements from an array.

import java.util.Scanner;

/**
 * •	Exercise 1: Delete an element from a specific position.
 * •	Start with the array {8, 16, 24, 32, 40}.
 * •	Delete the element at index 2.
 * Expected output:
 * 8 16 32 40 0
 */

public class Task_03_Exercise_01 {
    public static void main(String[] args) {
        int[] arr = {8, 16, 24, 32, 40}; // fixed array, deletion does not require extra space

        System.out.println("Array before deletion:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nInsert any index from 0 to " + (arr.length - 1) + ": ");
        int index = sc.nextInt(); // let's take the index from user

        // first method of deleting, It's not the proper deletion, basically it is swapping of element
//        for (int i = index; i < arr.length - 1; i++) {
//            int temp = 0;    // let's make that index element 0
//            arr[i] = arr[i + 1];
//            arr[i + 1] = temp;
//        }
//


//        second method of deleting, this is the proper way deletion

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // deleting elements
        }
        arr[arr.length - 1] = 0;

        System.out.println("Array after deletion:");
        for (int j : arr) {
            System.out.print(j + " ");
        }


    }
}
