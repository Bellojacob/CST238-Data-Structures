package Practice.Lab;

import java.io.*;
import java.util.Scanner;

public class MergeSortedFiles {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/jacobbello/IdeaProjects/CST238-Data-Structures/Practice/Lab/t1.txt");

        File file2 = new File("/Users/jacobbello/IdeaProjects/CST238-Data-Structures/Practice/Lab/t2.txt");

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));

        Scanner scanner = new Scanner(file2);

        int buffer1 = Integer.parseInt(reader1.readLine());
        int buffer2 = Integer.parseInt(scanner.next());

        while (buffer1 != -1 || buffer2 != -1) {

            if (buffer1 != -1 && buffer2 != -1) {

                if (buffer1 <= buffer2) {
                    System.out.print(buffer1 + " ");
                    String line = reader1.readLine();

                    if (line != null) {
                        buffer1 = Integer.parseInt(line);
                    } else {
                        buffer1 = -1;
                    }
                } else {
                    System.out.print(buffer2 + " ");
                    String line = scanner.next();

                    if (line != null) {
                        buffer2 = Integer.parseInt(line);
                    } else {
                        buffer2 = -1;
                    }
                }

            } else if (buffer1 != -1) {
                System.out.print(buffer1 + " ");
                String line = reader1.readLine();

                if (line != null) {
                    buffer1 = Integer.parseInt(line);
                } else {
                    buffer1 = -1;
                }
            } else {
                System.out.print(buffer2 + " ");
                String line = scanner.next();

                if (line != null) {
                    buffer2 = Integer.parseInt(line);
                } else {
                    buffer2 = -1;
                }
            }
        }

        reader1.close();
        scanner.close();
    }
}