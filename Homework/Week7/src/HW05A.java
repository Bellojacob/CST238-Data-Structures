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

        // Merge arrays a and b
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

        // Copy remaining elements of a, if any
        while (i < a.length) {
            newArray[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b, if any
        while (j < b.length) {
            newArray[k] = b[j];
            j++;
            k++;
        }

        return newArray;
    }
}
