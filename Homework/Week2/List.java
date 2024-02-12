import java.util.Scanner;
public class List {
    private int[] myArray;
    private int size;



    public void insert(int value, int position){
        size++;
        for (int i = size - 1; i > position; i--){
            myArray[i] = myArray[i - 1];
        }
        myArray[position] = value;
    }
    /*public static void main(String[] args) {
        List myList = new List();
        System.out.println("Constructing myList");
        System.out.println("Is the list empty? (should be true) " +
                myList.isEmpty());
        myList.display();
        System.out.println();
        for(int i = 0; i < 9; i++) {
            System.out.println("Inserting " + i + " at position "+ i/2);
            myList.insert(i, i/2);
            myList.display();
        }
        System.out.println();
        System.out.println("Is the list empty? (should be false) " +
                myList.isEmpty());
        System.out.println();
        System.out.println("Try to insert at position -1");
        myList.insert(0, -1);
        myList.display();
        System.out.println("Try to insert at position 10");
        myList.insert(0, 10);
        myList.display();
        System.out.println();
        System.out.println("Find 10 (should be -1): " + myList.find(10));
        System.out.println("Find 5 (should be 2): " + myList.find(5));
        System.out.println();
        System.out.println("Sum of list (should be 36): " + myList.sum());
        System.out.println();
        System.out.println("Append 17 (should be true): " + myList.append(17));
        System.out.println("Append 19 (should be false): " + myList.append(19));
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Give an index of a list element to remove: ");
        int remove = in.nextInt();
        myList.remove(remove);
        myList.display(); */
    public static void main(String[] args) {
        List newList = new List();
    }
    }

