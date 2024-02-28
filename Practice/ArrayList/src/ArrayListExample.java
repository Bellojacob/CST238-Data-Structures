import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apples");
        list.add("Bananas");

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(12.1);
        list2.add(15.5);

        for(String s : list){
            System.out.println(s);
        }

        for(Double s : list2){
            System.out.println(s);
        }
    }
}