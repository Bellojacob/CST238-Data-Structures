package Practice.Searching.src;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // create random array
        int[] data = new int[10];
        Random random = new Random();
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(10) + 1;
        }

        // print random array
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // now implement a linear search

        // ask user for search value
        // let user keep searching by using while loop
        int input = 1;
        while (input != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What number should I search for? ");
            input = scanner.nextInt();
            if (input == 0){
                System.out.println("EXITING");
                break;
            }
            System.out.println(search(data, input));
        }
    }
    public static String search(int[] d, int value){
        for (int i = 0; i < d.length; i++){
            if (d[i] == value){
                return "We found " + value + " at position " + i;
            }
        }
        return "We did not find " + value;
    }


}
