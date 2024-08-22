package Lab01_Ahtisham;
//Lab Task 05: Reverse Array

import java.util.Scanner;

/**
 * Write a function reverseArray that takes an array of integers as input and returns a new array that is the reverse of the input array.
 * Input: 1 3 5 7 9
 * <p>
 * Expected output:
 * 9 7 5 3 1
 */
public class Task_05_Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array element: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Given array reversed is: ");

        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
