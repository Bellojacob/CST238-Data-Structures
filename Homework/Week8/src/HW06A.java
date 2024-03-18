import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW06A {
    // write a program to read strings from input file, store in ArrayList, print them, then sort them using
    // Collections.sort(), then print the sorted ArrayList

    public void readFromFile() throws FileNotFoundException {
        File file = new File("C:\\Programming\\Java\\CST238-Data-Structures\\Homework\\Week8\\src\\f2.txt");
        FileReader fr = new FileReader(file);
        Scanner scanner = new Scanner(fr);
        ArrayList<String> list = new ArrayList<>();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
//            System.out.println(line);
            list.add(line);
        }

        System.out.println("Words: ");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(list);

        System.out.println("Sorted: ");
        for (String s : list){
            System.out.println(s);
        }
    }
}
