/*
 * Title: HW01a_Distinct.java
 * Abstract: This program takes user input and opens a file provided from the user, it goes through each integer in the
 * file and stores them into an array and find the smallest one. Then it counts how many times each number was used in
 *  the file.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 3 hours
 * Actual Time: 6 hours
 * Date: 1/27/2024
 */
import java.util.Scanner;
import java.io.*;
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

        // find max number
        int maxNumber = myArray[0];
        for (i = 1; i<myArray.length; i++){
            if (myArray[i] > maxNumber){
                maxNumber = myArray[i];
            }
        }

        System.out.println("Min Number:  " + minimumNumber);
        System.out.println("Number\t"+"Count");

        int [] secondArray = new int[firstNumber];
        // make a copy of the myArray into secondArray
        for (i = 0; i < myArray.length; i++){
            secondArray[i] = myArray[i];
        }

        int offset = -minimumNumber;
        boolean[] printedNumbers = new boolean[offset + maxNumber + 1];
        // iterate through first array
        for ( i = 0; i < myArray.length; i++) {
            // make current num the current position in myArray
            int currentNum = myArray[i];

            if (!printedNumbers[currentNum + offset]) {
                // init matching array variable
                int arrayMatch = 0;
                // nested loop to go through secondArray, start at pos myArray[i], and look at every element in
                // secondArray. If currentNum equals a position in secondArray then iterate arrayMatch
                for (int j = 0; j < secondArray.length; j++) {
                    if (currentNum == secondArray[j]) {
                        arrayMatch++;
                    }
                }
                // print current myArray element along with the amount of times arrayMatch was iterated.
                System.out.println(myArray[i] + "\t\t" + arrayMatch);
                // when we print a num, mark that number as true to avoid duplicating/printing that num again
                printedNumbers[currentNum + offset] = true;
            }
        }

        bufferedReader.close();
        fileReader.close();


    }
}