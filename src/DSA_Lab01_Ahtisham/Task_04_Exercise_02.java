package DSA_Lab01_Ahtisham;
//Lab Task 4: Searching in Arrays
//Objective: Practice different search techniques in arrays.

import java.util.Scanner;

/**
 * Exercise 2: Implement linear search to find an element by its value.
 * •	Start with the array {4, 6, 2, 8, 10}.
 * •	Search for the value 8.
 * Expected Output:
 * Element 8 found at index 3
 */
public class Task_04_Exercise_02 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 10};

        System.out.println("Enter the value you wan to search:");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.println("Element " + arr[i] + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + element + " not found");

    }
}
