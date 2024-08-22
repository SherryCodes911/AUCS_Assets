package Lab01_Ahtisham;
//Lab Task 4: Searching in Arrays
//Objective: Practice different search techniques in arrays.

import java.util.Scanner;

/**
 * •	Exercise 1: Search for an element by its index.
 * •	Start with the array {13, 26, 39, 52, 65}.
 * •	Search for the element at index 4.
 * Expected Output:
 * Element at index 4: 65
 */
public class Task_04_Exercise_01 {
    public static void main(String[] args) {

        int[] arr = {12, 26, 39, 52, 65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want to search: ");
        int indexByUser = sc.nextInt();
        System.out.println("Element at index " + indexByUser + " is " + arr[indexByUser]);


    }

}
