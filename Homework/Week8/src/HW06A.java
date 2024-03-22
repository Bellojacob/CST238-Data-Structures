import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/* Title: HW06A.java
 * Abstract: This program will read strings from input file, store in ArrayList, print them, then
 * sort them using Collections.sort(), then print the sorted ArrayList. To change between files just change file1 to file2
 * on line 23. Also, probably have to change the filepath for each file.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hour
 * Date: 03/18/2024
 */
//
public class HW06A {


    public void readFromFile() throws FileNotFoundException {
        File file1 = new File("C:\\Programming\\Java\\CST238-Data-Structures\\Homework\\Week8\\src\\f1.txt");
        File file2 = new File("C:\\Programming\\Java\\CST238-Data-Structures\\Homework\\Week8\\src\\f2.txt");
        FileReader fr = new FileReader(file1);
        Scanner scanner = new Scanner(fr);
        ArrayList<String> list = new ArrayList<>();

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
//            System.out.println(line);
            list.add(line);
        }

        System.out.println("Words: ");
        for (String s : list){
            System.out.println("\t"+s);
        }
        System.out.println();

        Collections.sort(list);

        System.out.println("Sorted: ");
        for (String s : list){
            System.out.println("\t"+s);
        }
    }
}
