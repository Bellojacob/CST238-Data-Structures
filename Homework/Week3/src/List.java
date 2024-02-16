/* Title: List.java
 * Abstract: I am adding on to the pre-existing list class from the lab we did on friday. I am adding 4 new methods to
 * the class, getSize, which returns the size of the list, get, which retrieves a value of an element at a certain index,
 * hasDuplicates, which checks if there are any duplicates in the list, and isSorted, which checks if the list is sorted
 * ascending or descending. Then I added a main method to display my new methods.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 1 hours
 * Date: 02/15/2024
 */
public class List {
    private static int DEFAULT_CAPACITY = 10;
    private int size;
    private int [] data;

    public List() {
        size = 0;
        data = new int[DEFAULT_CAPACITY];
    }

    public List(int capacity) {
        size = 0;
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item, int position) {
        if(size == data.length) {
            System.out.println("** No space for list element **");
            return;
        }

        if(position < 0 || position > size) {
            System.out.println("** Illegal location to insert " + position + " **");
            return;
        }

        // right shift
        for(int i = size; i > position; i--) {
            data[i] = data[i-1];
        }

        data[position] = item;
        size++;
    }

    public void remove(int position) {
        if(isEmpty()) {
            System.out.println("** Empty list - cannot remove **");
            return;
        }

        if(position < 0 || position >= size) {
            System.out.println("** Illegal location to remove " + position + " **");
            return;
        }

        // only uncomment for arrays of objects!
        // data[position] = null;

        for(int i = position; i < size - 1; i++) {
            data[i] = data[i+1];
        }

        size--;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty list");
            return;
        } else {
            System.out.print("List of size " + size + ": ");
        }

        for(int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int find(int value) {
        for(int i = 0; i < size; i++) {
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int sum() {
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += data[i];
        }
        return sum;
    }

    public boolean append(int value) {
        if(size == data.length) {
            System.out.println("** No room left to append **");
            return false;
        } else {
            data[size] = value;
            size++;
            return true;
        }
    }

    //ADD 4 NEW METHODS
    //GET SIZE
    //GET
    //HAS DUPLICATES
    //IS SORTED

    public int getSize(){
        return size;
    }

    public int get(int pos){
        if (pos < 0 || pos >= size){
            System.out.println("Invalid index!");
            return -1;
        } else {
            return data[pos];
        }
    }

    // should say true if there are duplicates
    public boolean hasDuplicates(){
        for (int i =0; i < size; i++){
            for (int j = i + 1; j < size; j++) {
                if (data[i] == data[j]) {
                    System.out.println("The duplicate is " + data[i]);
                    return true;
                }
            }
        } return false;
    }

    // if list is sorted in ascending or descending order then return true
    // but if the list is not sorted in any order return false
    // if the list is empty or only has one number then return true
    public boolean isSorted(){
        if (size == 0 || size ==1){
            return true;
        }
        boolean ascendingOrder = true;
        boolean descendingOrder = true;

        for (int i = 0; i < size -1; i++){
            if (data[i] > data[i + 1]){
                ascendingOrder = false;
            }
            if (data[i] < data[i + 1]){
                descendingOrder = false;
            }


        }
        if (ascendingOrder){
            return ascendingOrder;
        } else if (descendingOrder) {
            return descendingOrder;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        List l1 = new List();
        l1.append(20);
        l1.append(20);
        l1.append(10);
        l1.append(5);
        l1.display();
        System.out.println("The size of the list is: " + l1.getSize());
        System.out.println(l1.get(2));
        System.out.println("Is there any duplicates? " + l1.hasDuplicates());
        System.out.println("Is the list sorted? " + l1.isSorted());

    }
}