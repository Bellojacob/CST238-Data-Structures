import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        HW05A h1 = new HW05A();
        int [] array1 = h1.loadArray("C:\\Programming\\Java\\CST238-Data-Structures\\Homework\\Week7\\src\\f1.txt");
        int [] array2 = h1.loadArray("C:\\Programming\\Java\\CST238-Data-Structures\\Homework\\Week7\\src\\f2.txt");
//        for (int i : array){
//            System.out.println(i);
//        }

        int [] arraySorted = h1.mergeSorted(array1, array2);
        for (int i : arraySorted){
            System.out.print(i + " ");
        }
    }
}
