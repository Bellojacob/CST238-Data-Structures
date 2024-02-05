package Labs.Week2;/* Title: Lab02-array-class
 * Abstract: This program holds an array of ints and asks the user if they would like to EXIT, Shift to thr right, or
 * shift to the left.
 * Author: Jacob Bello & Arthur Barreau
 * Email: jbello@csumb.edu & abarreau@csumb.edu
 * Estimate: 1 hour
 * Date: 02/2/2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 20, 30, 35, 40, 45, 50, 60, 70};
        System.out.print("Array Values: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThis is the list of options ");
        System.out.println("\t0. Exit");
        System.out.println("\t1. Right shift");
        System.out.println("\t2. Left shift");
        System.out.println("\nEnter your option ");

        int input;
        do {
            input = scanner.nextInt();
            if (input == 1) {
                for (int i = myArray.length - 1 ; i > 0; i--) {
                    myArray[i] = myArray[i - 1];
                }
                myArray[0] = 0;
                System.out.print("Array Values: ");
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
            } else if (input == 2) {
                for (int i = 0; i < myArray.length - 1; i++) {
                    myArray[i] = myArray[i + 1];
                }
                myArray[myArray.length - 1] = 0;
                System.out.print("Array Values: ");
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " ");
                }
            }
            System.out.println("\n\nEnter your option: ");
        } while (input != 0);
        System.out.println("Done!");
    }
}