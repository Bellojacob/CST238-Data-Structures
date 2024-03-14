/* Title: HW05A.java
 * Abstract: This program is the first part of HW Wk 7, firstly we will create a file object and a scanner object that takes
 * the file, the first int in the file will be the size of the file, and we will create an array of that size. Then as
 * long as the file has items left, we will add those items (ints) to the newly created array. Then we create a
 * mergeSort method which will merge the two arrays together numerically. (least to greatest). And then return the
 * sorted array.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 2 hour
 * Date: 03/11/2024
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW05A {
    public static int [] loadArray(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        int n = scanner.nextInt();
        int [] data = new int[n];

        int size = 0;

        while (scanner.hasNextLine()){
            int nums = scanner.nextInt();
            data[size] = nums;
            size++;

        }


        return data;
    }

    public static int[] mergeSorted(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // merge arrays a and b
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                newArray[k] = a[i];
                i++;
            } else {
                newArray[k] = b[j];
                j++;
            }
            k++;
        }


        while (i < a.length) {
            newArray[k] = a[i];
            i++;
            k++;
        }


        while (j < b.length) {
            newArray[k] = b[j];
            j++;
            k++;
        }

        return newArray;
    }
}
