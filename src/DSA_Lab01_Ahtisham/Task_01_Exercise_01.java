package DSA_Lab01_Ahtisham;
//Lab Task 01: Array Basics and Traversal

//Objective: Learn how to declare, initialize, and traverse an array.
/**
 * Exercise 1: Declare an integer array of size 6 and initialize it with the values {5, 15, 25, 35, 45, 55}. Write a program to print all elements of the array.
 * Expected output:
 * 5 15 25 35 45 55
 */


public class Task_01_Exercise_01 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 45, 55}; // Initialized
        for (int j : array) {
            System.out.print(j + " "); // Printing
        }


    }
}
