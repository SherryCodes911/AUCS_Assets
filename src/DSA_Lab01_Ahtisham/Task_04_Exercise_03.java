package DSA_Lab01_Ahtisham;
//Lab Task 4: Searching in Arrays
//Objective: Practice different search techniques in arrays.


import java.util.Scanner;

/**
 * Exercise 3: Implement binary search on a sorted array.
 * •	Start with the sorted array {11, 22, 33, 44, 55}.
 * •	Search for the value 33.
 * Expected Output:
 * Element 33 found at index 2
 */


public class Task_04_Exercise_03 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        int low = 0, high = arr.length - 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int element = input.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == element) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (element < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Element " + element + " not found");


    }
}
