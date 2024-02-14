package Notes;

import java.awt.*;
import java.util.Scanner;

public class ArraysOfObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] names = new String[10];


        for (int i = 0; i < names.length; i++){
            System.out.println("Enter a name: ");
            names[i] = scanner.next();
        }

        // you can call methods on items in the array ex: names[i].toUppercase(); or names[3].length();
        // if the array is empty or the array index is null, you will get a NullPointerException error
    }

    List a = new List();
    //a.insert(100,1);
}
