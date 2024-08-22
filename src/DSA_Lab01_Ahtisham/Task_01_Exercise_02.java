package Lab01_Ahtisham;
// Lab Task 01: Array Basics and Traversal

// Objective: Learn how to declare, initialize, and traverse an array.
/**
 * Modify the program to print each element with its corresponding index.
 * Expected output:
 * Element at index 0: 5
 * Element at index 1: 15
 * Element at index 2: 25
 * Element at index 3: 35
 * Element at index 4: 45
 * Element at index 5: 55
 */

public class Task_01_Exercise_02 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 45, 55}; // Initialized as same
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]); // Modified Printing with index
        }
    }
}
