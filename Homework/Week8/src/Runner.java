import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
//        HW06A h1 = new HW06A();
//        h1.readFromFile();

        Time t1 = new Time(12, 55);
        Time t2 = new Time(29, 34);
        Time t3 = new Time(3, 45);
        Time t4 = new Time(22, 33);
//        System.out.println(t1.toStandard() + " - " + t1);
//        System.out.println(t2.toStandard() + " - " + t2);
//        System.out.println(t3.toStandard() + " - " + t3);
//        System.out.println(t4.toStandard() + " - " + t4);
//        Time t5 = t3.add(t4);
//        System.out.println(t5.toStandard() + " - " + t5);
//        Time t6 = new Time();
//        Time t7 = new Time(12);
//        System.out.println(t6.toStandard() + " - " + t6);
//        System.out.println(t7.toStandard() + " - " + t7);
        ArrayList<Time> al = new ArrayList<>();
        al.add(t1);
        al.add(t2);
        al.add(t3);
        al.add(t4);
        for (Time s : al){
            System.out.println(s);
        }





    }
}
