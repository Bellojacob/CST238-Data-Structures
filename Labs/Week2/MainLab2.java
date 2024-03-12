//package Labs.Week2;
//
//public class MainLab2 {
//
//import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//            List myList = new List();
//            System.out.println("Constructing myList");
//            System.out.println("Is the list empty? (should be true) " + myList.isEmpty());
//            myList.display();
//            System.out.println();
//
//            for(int i = 0; i < 9; i++) {
//                Money money = new Money();
//                money.setDollars(i);
//                System.out.println("Inserting " + money + " at position "+ i/2);
//                myList.insert(money, i/2);
//                myList.display();
//            }
//            System.out.println();
//
//            System.out.println("Is the list empty? (should be false) " + myList.isEmpty());
//            System.out.println();
//
//            System.out.println("Try to insert at position -1");
//            myList.insert(new Money(), -1);
//            myList.display();
//            System.out.println("Try to insert at position 10");
//            myList.insert(new Money(), 10);
//            myList.display();
//            System.out.println();
//
//            Money ten = new Money();
//            ten.setDollars(10);
//            System.out.println("Find 10 (should be -1): " + myList.find(ten));
//            Money five = new Money();
//            five.setDollars(5);
//            System.out.println("Find 5 (should be 2): " + myList.find(five));
//            System.out.println();
//
//            System.out.println("Sum of list (should be 36): " + myList.sum());
//            System.out.println();
//      /*
//        System.out.println("Append 17 (should be true): " + myList.append(17));
//        System.out.println("Append 19 (should be false): " + myList.append(19));
//        System.out.println();
//      */
//
//            Scanner in = new Scanner(System.in);
//            System.out.print("Give an index of a list element to remove: ");
//            int remove = in.nextInt();
//            myList.remove(remove);
//            myList.display();
//
//        }
//    }
//
//}
