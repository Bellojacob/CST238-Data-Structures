import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i =0; i < 10000; i++){
            int num = r.nextInt(10001);
            list.add(num);
        }

        for (int i : list){
            System.out.print(i + " ");
        }

        System.out.println();
        Collections.sort(list);

        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
