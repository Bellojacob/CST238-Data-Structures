/*
 * Title: HW01a_Distinct.java
 * Abstract: This program takes user input and opens a file provided from the user, it goes through each integer in the
 * file and stores them into an array and find the smallest one. Then it counts how many times each number was used in
 *  the file.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 3 hours
 * Date: 1/27/2024
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HW01a_Distinct {
    public static void main(String[] args) throws IOException {


        // ask user for file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String filename = scanner.nextLine();

        // set up file readers to pull data from file
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // get first int
        String firstline = bufferedReader.readLine();
        int firstNumber = 0;
        if (firstline != null) {
            firstNumber = Integer.parseInt(firstline);
        }
        //System.out.println("There are " + firstNumber + " numbers in the file");

        // create an array with the amount of numbers in the file
        int[] myArray = new int[firstNumber];



        // store numbers from file into myArray
        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            int data = Integer.parseInt(line);
            //System.out.println(data);
            myArray[i] = data;
            i++;
        }

        // can use this for loop to see what's in the array
        /*
        for (i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        */


        // find minimum number
        int minimumNumber = myArray[0];
        for (i = 0; i < myArray.length; i++){
            if (myArray[i] < minimumNumber){
                minimumNumber = myArray[i];
            }
        } // end find of min num

        System.out.println("Min Number:  " + minimumNumber);
        System.out.printf("%-7s %s%n", "Number", "Count");

        // start of method to print out each number and how many times it is used.

        // look at each element in the array
        // this what an example array looks like
        // myArray [1, 3, 2, 3, 2]
        // second array [1,3,2,3,2]


        int [] secondArray = new int[firstNumber];
        int count =0;

        for (i = 0; i < myArray.length; i++){
            secondArray[i] = myArray[i];
        }



        for (i=0; i<myArray.length; i++){
            int currentNum = myArray[i];
            int arrayMatch = 0;
            for (int j =0; j < secondArray.length; j++){
                if (currentNum == myArray[i]){
                    arrayMatch++;
                }
            }

            System.out.println("The number is " + myArray[i] + " and it is used " + arrayMatch + " times");
        }



        bufferedReader.close();
        fileReader.close();


    }
}
