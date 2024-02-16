/* Title: NumberList.java
 * Abstract: I created a new class called NumberList which has an array of 10 int numbers. I implemented my own checkSize
 * method which will print out the initial size which is always 10, and compares it to the actual size of the array. It
 * will tell the user if there is or isn't enough space to add an item to the array. Then we have a method to print the
 *  list, a method to check if the list is empty, a method to delete the max number in the list and
 * shift every other number over, we have an append method to add a number to the list if there is space to add one or
 * tell the user there is not enough space, and then a reverse method to reverse all the items in the list.
 * Author: Jacob Bello
 * Email: jbello@csumb.edu
 * Estimate: 2 hours
 * Date: 02/13/2024
 */
public class NumberList {
    private int[] myArray = {10, 20, 30, 40, 50, 15, 25, 35, 45, 55};
    // list capacity is 10
    private int size = myArray.length;
    private final int initSize = myArray.length;

    public void checkSize(){
        if (size < initSize) {
            System.out.println(size + " elements are currently being used in the array which has a " + initSize + " capacity");
            System.out.println("Which means there are " + (initSize - size) + " elements empty");
        } else {
            System.out.println("There are no more spaces left in the list!");
        }
    }
    // method to check if list is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // method to print out elements of myArray
    public void print(){
        for (int i =0; i < size; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    // delete max value by shifting left
    public void deleteMax(){
        if (! isEmpty()){

            // find the biggest index
            int maxIndex = 0;
            for (int i = 0; i < size; i++){
                if (myArray[i] > myArray[maxIndex]){
                    maxIndex = i;
                }
            }

            // shift every value to the left and after decrement size
            for (int i = maxIndex; i < size - 1; i++){
                myArray[i] = myArray[i + 1];
            }

            size--;
        } else {
            System.out.println("List is empty!");
        }
    }

    // add new ints to the array with the append method
    // to end of list
    public void append(int value) {
        // check if list is full
        if (size >= initSize) {
            System.out.println("List at capacity");
        } else {
            if (size < initSize) {
                // if it is not full then append value to the last spot in the array/list
                myArray[size] = value;
                size++;
            }
        }

    }

    // reverse the contents of the list
    public void reverse(){
        if (!isEmpty()){
            for (int i = 0; i < size/2; i++){
                int tempNum = myArray[i];
                myArray[i] = myArray[size - 1 - i];
                myArray[size - 1 - i] = tempNum;
            }
        }
    }




    public static void main(String[] args) {
        NumberList nl = new NumberList();
        nl.print();
        nl.deleteMax();
        nl.deleteMax();
        nl.print();
        nl.checkSize();
        nl.append(81);
        nl.print();
        nl.append(99);
        nl.print();
        nl.append(151);
        nl.print();
    }
}
