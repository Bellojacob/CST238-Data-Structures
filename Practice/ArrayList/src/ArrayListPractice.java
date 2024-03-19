package Practice.ArrayList.src;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice{



    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Hello");
        myList.add("Every");
        myList.add("One");
        myList.add("Out");
        myList.add("There");

//        for (String s : myList){
//            System.out.println(s);
//        }

        Car c1 = new Car("Jetta", 2016, "grey");
        Car c2 = new Car("Prius", 2020, "Blue");
        Car c3 = new Car("Corolla", 2018, "White");

        ArrayList<Car> CarsList = new ArrayList<>();
        CarsList.add(c1);
        CarsList.add(c2);
        CarsList.add(c3);

        for (Car s : CarsList){
            System.out.println(s);
        }

        System.out.println();

        Collections.sort(CarsList);

        for (Car s : CarsList){
            System.out.println(s);
        }


    }
}
