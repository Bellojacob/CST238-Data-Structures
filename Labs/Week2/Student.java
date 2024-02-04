import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Student {

    String name;
    double exam1;
    double exam2;

    Student(String name, double exam1, double exam2){
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    String getName(){
        return this.name;
    }

    double getAverage(){
        return (exam1 + exam2) / 2;
    }

    String toString2(){
        return name + "'s average: " + getAverage();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String userFile = scanner.nextLine();

        FileReader read = new FileReader(userFile);
        Scanner file = new Scanner(read);

        Student student1 = new Student(file.next(), file.nextDouble(), file.nextDouble());
        Student student2 = new Student(file.next(), file.nextDouble(), file.nextDouble());

        System.out.println(student1.toString2());
        System.out.println(student2.toString2());

        if (student1.getAverage() > student2.getAverage()){
            System.out.println(student1.name + " has a better score than " + student2.name);
        } else {
            System.out.println(student2.name + " has a better score than " + student1.name);
        }


    }
}
