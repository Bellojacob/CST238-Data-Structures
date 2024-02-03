/*
 * Title: HW01b_Histograms.java
 * Abstract: This program takes user input and opens a file provided from the user, the program loops through the file
 * looking for integers and prints *'s left to right based on the integer value on each line.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hours
 * Date: 1/27/2024
 */

import java.io.*;
import java.util.Scanner;

public class HW01b_Histograms {
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
}
}
