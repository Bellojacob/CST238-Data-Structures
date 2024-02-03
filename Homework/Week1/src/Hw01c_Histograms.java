/*
 * Title: HW01a_Distinct.java
 * Abstract: This program takes user input and opens a file provided from the user, is a continuation from the last file,
 * but with a new method added that prints *'s top to bottom. To do this we use a nested for loop to either print " " or
 * a "*".
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 2 hours
 * Date: 1/27/2024
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Hw01c_Histograms {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String filename = scanner.nextLine();

        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String firstline = bufferedReader.readLine();
        int firstNumber = 0;
        if (firstline != null) {
            firstNumber = Integer.parseInt(firstline);
        }

        int[] myArray = new int[firstNumber];

        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            int data = Integer.parseInt(line);
            //System.out.println(data);
            myArray[i] = data;
            i++;


        }

        System.out.println("===== Horizontal Histogram =====");
        for (i =0; i < myArray.length; i++){
            System.out.print(myArray[i] + ":");
            for (int j = 0; j < myArray[i]; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        verticalHistograms(myArray);
    }
    public static void verticalHistograms(int [] myArray){
        System.out.println("===== Vertical Histogram =====");

        // need to find the biggest number in the file
        int biggestNum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > biggestNum){
                biggestNum = myArray[i];
            }
        } // end of loop
        // let's see what the biggest num in the array is
        System.out.println("The biggest number in the array is " + biggestNum);

        for (int i = biggestNum; i >= 1; i--) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i=0; i < myArray.length; i++){
            System.out.print("--");
        }

        System.out.println();

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    } // end of method
} // end of program


